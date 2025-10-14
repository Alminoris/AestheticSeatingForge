package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.util.helper.VoxelShapeHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
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
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;

public class SeatingLog extends SeatingFurniture
{
    private static final VoxelShape SEAT = Block.box(2, 0, 5, 14, 6, 11);
    private static final VoxelShape SEAT_CENTER = Block.box(0, 0, 5, 16, 6, 11);
    private static final VoxelShape SEAT_LEFT = Block.box(2, 0, 5, 16, 6, 11);
    private static final VoxelShape SEAT_RIGHT = Block.box(0, 0, 5, 14, 6, 11);

    public enum Variant implements StringRepresentable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.create("variant", Variant.class);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public SeatingLog()
    {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE), -0.45D);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(VARIANT, Variant.NORMAL));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx)
    {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.getValue(FACING);

        List<AABB> boxes = new ArrayList<>();
        switch(state.getValue(VARIANT))
        {
            case NORMAL -> boxes.add(SEAT.bounds());
            case CENTER -> boxes.add(SEAT_CENTER.bounds());
            case LEFT -> boxes.add(SEAT_LEFT.bounds());
            case RIGHT -> boxes.add(SEAT_RIGHT.bounds());
        }

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor world, BlockPos pos, BlockPos neighborPos)
    {
        return updateSeatingLogVariant(state, world, pos);
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onPlace(state, world, pos, oldState, notify);
        updateSurroundingLogs(world, pos);
    }

    private void updateSurroundingLogs(Level world, BlockPos pos)
    {
        for (Direction dir : Direction.Plane.HORIZONTAL)
        {
            BlockPos neighborPos = pos.relative(dir);
            BlockState neighborState = world.getBlockState(neighborPos);
            if (neighborState.getBlock() instanceof SeatingLog)
                world.setBlock(neighborPos, updateSeatingLogVariant(neighborState, world, neighborPos), 3);
        }
    }

    private BlockState updateSeatingLogVariant(BlockState state, LevelAccessor world, BlockPos pos)
    {
        Direction facing = state.getValue(FACING);
        BlockPos leftPos = pos.relative(facing.getCounterClockWise());
        BlockPos rightPos = pos.relative(facing.getClockWise());

        boolean leftConnected = isFullSolidOrMatchingLog(world, leftPos, facing);
        boolean rightConnected = isFullSolidOrMatchingLog(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.setValue(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.setValue(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.setValue(VARIANT, Variant.LEFT);
        else
            return state.setValue(VARIANT, Variant.NORMAL);
    }

    private boolean isFullSolidOrMatchingLog(LevelAccessor world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);

        if (state.getBlock() instanceof SeatingLog && state.getValue(FACING) == facing)
            return true;

        return state.isSolid() && state.canOcclude();
    }
}
