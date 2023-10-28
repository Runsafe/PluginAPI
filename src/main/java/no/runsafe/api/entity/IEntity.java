package no.runsafe.api.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;
import no.runsafe.api.event.entity.IEntityDamageEvent;
import no.runsafe.api.metadata.IMetadata;
import no.runsafe.api.minecraft.RunsafeEntityType;
import no.runsafe.api.vector.IPoint3D;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public interface IEntity extends IMetadata
{
	void strikeWithLightning(boolean effectOnly);
	void explode(float power, boolean setFire, boolean breakBlocks);
	@Nullable
    ILocation getLocation();
	@Nullable
    IWorld getWorld();
	boolean teleport(ILocation location);
	boolean teleport(IEntity entity);
	List<IEntity> getNearbyEntities(double x, double y, double z);
	int getEntityId();
	int getFireTicks();
	int getMaxFireTicks();
	void setFireTicks(int i);
	void remove();
	boolean isDead();
	@Nullable IEntity getPassenger();
	boolean setPassenger(IEntity entity);
	boolean isEmpty();
	boolean eject();
	float getFallDistance();
	void setFallDistance(float distance);
	void setLastDamageCause(IEntityDamageEvent entityDamageEvent);
	IEntityDamageEvent getLastDamageCause();
	UUID getUniqueId();
	int getTicksLived();
	void setTicksLived(int ticks);
	boolean isInsideVehicle();
	boolean leaveVehicle();
	IEntity getVehicle();
	RunsafeEntityType getEntityType();
	void setVelocity(IPoint3D velocity);
	void setSilent(boolean audible);
	boolean isSilent();
	@Override boolean equals(Object o);
	@Override int hashCode();
}
