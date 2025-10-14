package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.block.ModBlocks;
import net.alminoris.aestheticseating.item.ModItems;
import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class Settee extends SeatingFurniture
{
    private static final VoxelShape SEAT = Block.box(-4.0D, 0.0D, 0.0D, 20.0D, 4.0D, 14.0D);

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty VARIANT = IntegerProperty.create("variant", 0, 2);
    public static final BooleanProperty TRANSFORMED = BooleanProperty.create("transformed");

    private final String name;

    public Settee(String name)
    {
        super(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL), -0.55D);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, net.minecraft.core.Direction.NORTH)
                .setValue(TRANSFORMED, false)
                .setValue(VARIANT, 0));
        this.name = name;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context)
    {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, TRANSFORMED, VARIANT);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getItemInHand(hand);
        boolean currentTransformed = state.getValue(TRANSFORMED);
        int currentVariant = state.getValue(VARIANT);
        net.minecraft.core.Direction currentFacing = state.getValue(FACING);

        // Wrench tool tag: "aestheticseating:wrench"
        if (stack.is(ItemTags.create(ResourceLocation.fromNamespaceAndPath("aestheticseating", "wrench"))))
        {
            if (!level.isClientSide)
            {
                level.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(TRANSFORMED, !currentTransformed)
                        .setValue(VARIANT, currentVariant), 3);

                if (stack.isDamageableItem())
                {
                    stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
                }
            }

            return InteractionResult.SUCCESS;
        }

        // Adding cushion
        if (stack.getItem() == ModBlocks.CUSHIONS.get(name).get().asItem() && currentVariant < 2)
        {
            if (!level.isClientSide)
            {
                level.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(TRANSFORMED, currentTransformed)
                        .setValue(VARIANT, currentVariant + 1), 3);

                stack.shrink(1);
            }

            return InteractionResult.SUCCESS;
        }

        // Removing cushion
        if (stack.getItem() == ModItems.CUSHION_REMOVER.get() && currentVariant > 0)
        {
            if (!level.isClientSide)
            {
                level.setBlock(pos, state
                        .setValue(FACING, currentFacing)
                        .setValue(TRANSFORMED, currentTransformed)
                        .setValue(VARIANT, currentVariant - 1), 3);

                if (stack.isDamageableItem())
                {
                    stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(InteractionHand.MAIN_HAND));
                }

                ItemStack carpetStack = new ItemStack(ModBlocks.CUSHIONS.get(name).get().asItem());
                if (!player.getInventory().add(carpetStack))
                    player.drop(carpetStack, false);
            }

            return InteractionResult.SUCCESS;
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        net.minecraft.core.Direction direction = state.getValue(FACING);
        List<net.minecraft.world.phys.AABB> boxes = new ArrayList<>();
        boxes.add(SEAT.bounds());
        return VoxelShapeHelper.rotateShape(boxes, direction);
    }
}
