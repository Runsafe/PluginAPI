package no.runsafe.framework.api.entity;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.entity.projectiles.IProjectile;
import no.runsafe.framework.api.item.IMaterial;
import no.runsafe.framework.api.minecraft.RunsafeEntityType;

import java.util.HashSet;
import java.util.List;

public interface ILivingEntity extends IDamageable, IProjectileSource
{
	IBlock getTargetBlock();
	IEntity Fire(IProjectile projectileType);
	IEntity Launch(RunsafeEntityType entityType);
	void removeBuffs();
	IEntityEquipment getEquipment();
	double getEyeHeight();
	double getEyeHeight(boolean ignoreSneaking);
	ILocation getEyeLocation();
	List<IBlock> getBlocksInLineOfSight(HashSet<IMaterial> transparent, int maxDistance);
	IBlock getTargetedBlock(HashSet<IMaterial> transparent, int maxDistance);
	List<IBlock> getLastTwoTargetedBlocks(HashSet<IMaterial> transparent, int maxDistance);
	int getRemainingAir();
	void setRemainingAir(int remainingAirTicks);
	int getMaximumAir();
	void setMaximumAir(int maximumAirTicks);
	int getMaximumNoDamageTicks();
	void setMaximumNoDamageTicks(int maximumNoDamageTicks);
	double getLastDamage();
	void setLastDamage(double damage);
	int getNoDamageTicks();
	void setNoDamageTicks(int noDamageTicks);
	IEntity getKiller();
	IEntity getLeashHolder();
	void setLeashHolder(IEntity entity);
	boolean isLeashed();
	void setCustomName(String name);
	String getCustomName();
	void stopPathfinding();
	boolean getPersistence();
	void setPersistence(boolean persistance);
}
