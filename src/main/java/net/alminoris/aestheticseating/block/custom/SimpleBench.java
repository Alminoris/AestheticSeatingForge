package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.item.Item;
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
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class SimpleBench extends SeatingFurniture
{
    private static final VoxelShape SEAT = Block.box(0, 0, 3, 16, 9, 13);

    public enum Variant implements StringRepresentable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String getSerializedName()
        {
            return this.name;
        }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.create("variant", Variant.class);
    public static final BooleanProperty BACKREST = BooleanProperty.create("backrest");
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    private final String name;

    public SimpleBench(String name)
    {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), -0.30D);
        this.name = name;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(VARIANT, Variant.NORMAL)
                .setValue(BACKREST, false));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, BACKREST);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.getValue(FACING);
        List<AABB> shapes = new ArrayList<>();
        shapes.add(SEAT.bounds());
        return VoxelShapeHelper.rotateShape(shapes, direction);
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        Variant currentVariant = state.getValue(VARIANT);
        boolean currentBackrest = state.getValue(BACKREST);

        // Remove backrest with axe
        if (stack.is(ItemTags.AXES))
        {
            if (!world.isClientSide)
            {
                if (currentBackrest)
                {
                    currentBackrest = false;
                    damageOrConsume(stack, player);
                    Direction currentFacing = state.getValue(FACING);
                    world.setBlock(pos, state.setValue(FACING, currentFacing)
                            .setValue(VARIANT, currentVariant)
                            .setValue(BACKREST, currentBackrest), 3);
                }
            }
            return ItemInteractionResult.sidedSuccess(world.isClientSide);
        }

        // Add backrest with wrench + matching offhand item
        if (!currentBackrest && stack.is(TagKey.create(ForgeRegistries.ITEMS.getRegistryKey(),
                ResourceLocation.fromNamespaceAndPath("aestheticseating", "wrench")))
                && Block.byItem(player.getOffhandItem().getItem()) != Blocks.AIR)
        {
            if (!world.isClientSide)
            {
                Block block = Block.byItem(player.getOffhandItem().getItem());
                String check = checkForWrenching(ForgeRegistries.BLOCKS.getKey(block).getPath());
                if (!check.isEmpty() && this.name.equals(check))
                {
                    currentBackrest = true;
                    player.getOffhandItem().shrink(1);
                    damageOrConsume(stack, player);
                    Direction currentFacing = state.getValue(FACING);
                    world.setBlock(pos, state.setValue(FACING, currentFacing)
                            .setValue(VARIANT, currentVariant)
                            .setValue(BACKREST, currentBackrest), 3);
                }
            }
            return ItemInteractionResult.sidedSuccess(world.isClientSide);
        }

        return super.useItemOn(stack, state, world, pos, player, hand, hit);
    }

    private void damageOrConsume(ItemStack stack, Player player)
    {
        if (stack.isDamageableItem())
        {
            if (stack.getDamageValue() < stack.getMaxDamage() - 1)
                stack.setDamageValue(stack.getDamageValue() + 1);
            else
                stack.shrink(1);
        }
    }

    private String checkForWrenching(String name)
    {
        name = name.replace("_nss", "");
        String[] arr = name.split("_");
        if (arr.length > 0 && arr[0].equals("stripped"))
        {
            if (arr.length > 3)
                return arr[1] + "_" + arr[2];
            else
                return arr[1];
        }
        return "";
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor world, BlockPos pos, BlockPos neighborPos)
    {
        return updateBenchVariant(state, world, pos);
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving)
    {
        super.onPlace(state, world, pos, oldState, isMoving);
        updateSurroundingBenches(world, pos);
    }

    private void updateSurroundingBenches(Level world, BlockPos pos)
    {
        for (Direction dir : Direction.Plane.HORIZONTAL)
        {
            BlockPos neighborPos = pos.relative(dir);
            BlockState neighborState = world.getBlockState(neighborPos);
            if (neighborState.getBlock() instanceof SimpleBench)
                world.setBlock(neighborPos, updateBenchVariant(neighborState, world, neighborPos), 3);
        }
    }

    private BlockState updateBenchVariant(BlockState state, LevelAccessor world, BlockPos pos)
    {
        Direction facing = state.getValue(FACING);
        BlockPos leftPos = pos.relative(facing.getCounterClockWise());
        BlockPos rightPos = pos.relative(facing.getClockWise());

        boolean leftConnected = isBench(world, leftPos, facing);
        boolean rightConnected = isBench(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.setValue(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.setValue(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.setValue(VARIANT, Variant.LEFT);
        else
            return state.setValue(VARIANT, Variant.NORMAL);
    }

    private boolean isBench(LevelAccessor world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof SimpleBench && state.getValue(FACING) == facing;
    }
}
