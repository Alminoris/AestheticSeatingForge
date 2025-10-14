package net.alminoris.aestheticseating.entity.custom;

import net.alminoris.aestheticseating.util.SeatEntityPool;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Explosion;

public class SeatEntity extends Entity {
    private static final int CLEANUP_DELAY = 20; // 1 second delay before cleanup if unused
    public int cleanupTimer = 0;

    public SeatEntity(EntityType<? extends SeatEntity> type, Level level) {
        super(type, level);
        this.setNoGravity(true);
    }

    public static SeatEntity createOrReuse(Level level, BlockPos pos, double seatY) {
        SeatEntity seat = SeatEntityPool.getInstance().obtainSeat(level, pos, seatY);
        seat.setPos(pos.getX() + 0.5, pos.getY() + seatY, pos.getZ() + 0.5);
        return seat;
    }

    @Override
    public void tick() {
        super.tick();

        this.setDeltaMovement(0, 0, 0);

        if (!getLevel().isClientSide) {
            if (getPassengers().isEmpty()) {
                cleanupTimer++;
                if (cleanupTimer >= CLEANUP_DELAY) {
                    cleanupTimer = 0;
                    SeatEntityPool.getInstance().release(this);
                }
            } else {
                cleanupTimer = 0;
            }
        }
    }

    @Override
    protected void defineSynchedData() {}

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {}

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {}

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public boolean canRide(Entity entity)
    {
        return !(entity instanceof SeatEntity);
    }

    @Override
    protected boolean canAddPassenger(Entity passenger)
    {
        return this.getPassengers().isEmpty() && passenger instanceof Player;
    }

    @Override
    public boolean ignoreExplosion()
    {
        return true;
    }

    @Override
    public Packet<?> getAddEntityPacket()
    {
        return new ClientboundAddEntityPacket(this);
    }

    @Override
    public boolean isColliding(BlockPos pos, BlockState state)
    {
        return false;
    }

    @Override
    public void positionRider(Entity passenger)
    {
        passenger.setPos(this.getX(), this.getY() + 0.2, this.getZ());
    }
}
