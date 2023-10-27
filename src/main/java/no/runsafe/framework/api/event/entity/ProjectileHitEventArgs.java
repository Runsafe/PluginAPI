package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.entity.projectiles.IProjectile;
import no.runsafe.framework.api.event.player.EntityEventArgs;

public interface ProjectileHitEventArgs extends EntityEventArgs {
    IProjectile getProjectile();
}
