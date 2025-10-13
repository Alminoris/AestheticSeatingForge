package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class Sofa extends SeatingFurniture
{
    private static final VoxelShape SEAT = Block.box(0.0D, 2.0D, 1.0D, 16.0D, 7.0D, 15.0D);
    private static final VoxelShape SEAT_NORMAL = Block.box(1.0D, 2.0D, 1.0D, 15.0D, 7.0D, 15.0D);

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty CUSHION = BooleanProperty.create("cushion");

    public enum Variant implements net.minecraft.util.StringRepresentable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right"),
        LEFTCORNER("leftcorner"),
        RIGHTCORNER("rightcorner");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String getSerializedName() { return this.name; }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.create("variant", Variant.class);

    private final String name;

    public Sofa(String name)
    {
        super(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), -0.4D);
        this.name = name;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(VARIANT, Variant.NORMAL)
                .setValue(CUSHION, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, CUSHION);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.getValue(FACING);
        Variant variant = state.getValue(VARIANT);

        List<net.minecraft.world.phys.AABB> boxes = new ArrayList<>();
        if (variant == Variant.NORMAL)
            boxes.add(SEAT_NORMAL.bounds());
        else
            boxes.add(SEAT.bounds());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(hand);
        boolean currentCushion = state.getValue(CUSHION);
        Variant currentVariant = state.getValue(VARIANT);
        Direction currentFacing = state.getValue(FACING);

        // Add cushion
        if (stack.getItem() == ModBlocks.CUSHIONS.get(name).get().asItem() && !currentCushion)
        {
            if (!level.isClientSide)
            {
                level.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(CUSHION, true)
                        .setValue(VARIANT, currentVariant), 3);

                stack.shrink(1);
            }
            return InteractionResult.SUCCESS;
        }

        // Remove cushion
        if (stack.getItem() == ModItems.CUSHION_REMOVER.get() && currentCushion)
        {
            if (!level.isClientSide)
            {
                level.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(CUSHION, false)
                        .setValue(VARIANT, currentVariant), 3);

                if (stack.isDamageableItem())
                    stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
                else
                    stack.shrink(1);

                ItemStack carpetStack = new ItemStack(ModBlocks.CUSHIONS.get(name).get().asItem());
                if (!player.getInventory().add(carpetStack))
                    player.drop(carpetStack, false);
            }
            return InteractionResult.SUCCESS;
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos)
    {
        return updateSofaVariant(world, state, pos);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean moving)
    {
        super.onPlace(state, level, pos, oldState, moving);
        updateSurroundingSofas(level, pos);
    }

    private void updateSurroundingSofas(Level world, BlockPos pos)
    {
        for (Direction direction : Direction.Plane.HORIZONTAL)
        {
            BlockPos neighborPos = pos.relative(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof Sofa)
            {
                BlockState updatedState = updateSofaVariant(world, neighborState, neighborPos);
                if (!neighborState.equals(updatedState))
                {
                    world.setBlock(neighborPos, updatedState, 3);
                }
            }
        }
    }

    private BlockState updateSofaVariant(LevelAccessor world, BlockState state, BlockPos pos)
    {
        Direction facing = state.getValue(FACING);

        BlockPos leftPos = pos.relative(facing.getCounterClockWise());
        BlockPos rightPos = pos.relative(facing.getClockWise());

        boolean leftConnected = isSofa(world, leftPos, facing, Variant.RIGHTCORNER);
        boolean rightConnected = isSofa(world, rightPos, facing, Variant.LEFTCORNER);

        if (isSofaL(world, rightPos.relative(facing.getCounterClockWise()).relative(facing.getClockWise().getClockWise()), facing))
        {
            return state.setValue(VARIANT, Variant.RIGHTCORNER);
        }
        else if (isSofaR(world, leftPos.relative(facing.getClockWise()).relative(facing.getCounterClockWise().getCounterClockWise()), facing))
        {
            return state.setValue(VARIANT, Variant.LEFTCORNER);
        }
        else if (leftConnected && rightConnected)
        {
            return state.setValue(VARIANT, Variant.CENTER);
        }
        else if (leftConnected)
        {
            return state.setValue(VARIANT, Variant.RIGHT);
        }
        else if (rightConnected)
        {
            return state.setValue(VARIANT, Variant.LEFT);
        }
        else
        {
            return state.setValue(VARIANT, Variant.NORMAL);
        }
    }

    private boolean isSofa(LevelAccessor world, BlockPos pos, Direction expectedFacing, Variant variant)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof Sofa &&
                (state.getValue(FACING) == expectedFacing || state.getValue(VARIANT) == variant);
    }

    private boolean isSofaL(LevelAccessor world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof Sofa &&
                state.getValue(FACING) == expectedFacing.getClockWise();
    }

    private boolean isSofaR(LevelAccessor world, BlockPos pos, Direction expectedFacing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof Sofa &&
                state.getValue(FACING) == expectedFacing.getCounterClockWise();
    }
}
