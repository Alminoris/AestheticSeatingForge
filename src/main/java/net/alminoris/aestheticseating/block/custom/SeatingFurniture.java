package net.alminoris.aestheticseating.block.custom;

import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;


public abstract class SeatingFurniture extends Block implements SimpleWaterloggedBlock
{
    private final double seatY;

    public SeatingFurniture(BlockBehaviour.Properties settings, double seatY)
    {
        super(settings);
        this.seatY = seatY;
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit)
    {
        if (world.isClientSide)
        {
            return InteractionResult.SUCCESS;
        }

        if (!player.isPassenger())
        {
            boolean seatExists = world.getEntitiesOfClass(SeatEntity.class, new AABB(pos), Entity::isAlive)
                    .stream().findFirst().isPresent();

            if (!seatExists) {
                SeatEntity seat = SeatEntity.createOrReuse(world, pos, this.seatY);
                world.addFreshEntity(seat);

                player.startRiding(seat, true);
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public RenderShape getRenderShape(BlockState state)
    {
        return RenderShape.MODEL;
    }
}
