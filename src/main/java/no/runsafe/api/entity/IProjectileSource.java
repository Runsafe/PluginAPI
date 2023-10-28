package no.runsafe.api.entity;

import no.runsafe.api.entity.projectiles.IProjectile;
import no.runsafe.api.vector.IPoint3D;

public interface IProjectileSource
{
    <T extends IProjectile> T launchProjectile(Class<? extends T> projectile);
    <T extends IProjectile> T launchProjectile(Class<? extends T> projectile, IPoint3D velocity);
}
