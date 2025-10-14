package net.alminoris.aestheticseating.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Cushion extends SeatingFurniture
{
    private static final VoxelShape SEAT = Cushion.box(3.0D, 0.0D, 3.0D, 13.0D, 4.0D, 13.0D);

    public Cushion()
    {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL), -0.55D);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context)
    {
        return SEAT;
    }
}