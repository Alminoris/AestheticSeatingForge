package net.alminoris.aestheticseating.util;

import net.alminoris.aestheticseating.entity.ModEntities;
import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

import java.util.ArrayDeque;
import java.util.Queue;

public class SeatEntityPool
{
    private static final SeatEntityPool INSTANCE = new SeatEntityPool();
    private final Queue<SeatEntity> availableSeats = new ArrayDeque<>();

    public static SeatEntityPool getInstance()
    {
        return INSTANCE;
    }

    public SeatEntity obtainSeat(Level world, BlockPos pos, double seatY)
    {
        SeatEntity seat = availableSeats.poll();

        if (seat == null || !seat.isAlive())
        {
            seat = new SeatEntity(ModEntities.SEAT.get(), world);
        }
        else
        {
            seat.setPos(pos.getX() + 0.5, pos.getY()+seatY, pos.getZ() + 0.5);
            seat.cleanupTimer = 0;
        }
        return seat;
    }

    public void release(SeatEntity seatEntity)
    {
        if (seatEntity.isAlive())
        {
            seatEntity.setRemoved(Entity.RemovalReason.DISCARDED);
            availableSeats.offer(seatEntity);
        }
    }
}