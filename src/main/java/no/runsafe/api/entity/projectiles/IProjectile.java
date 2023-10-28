package no.runsafe.api.entity.projectiles;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.entity.IEntity;
import no.runsafe.api.entity.ILivingEntity;
import no.runsafe.api.entity.IProjectileSource;
import no.runsafe.api.player.IPlayer;

public interface IProjectile extends IEntity
{
	IBlock getImpaledBlock();

	IPlayer getShootingPlayer();

	ILivingEntity getShootingEntity();

	IProjectileSource getShooter();

	void setShooter(ILivingEntity livingEntity);

	boolean getBounce();

	void setBounce(boolean bounce);

	boolean isOnGround();
}
