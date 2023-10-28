package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.entity.projectiles.IProjectile;

public interface ProjectileHitEventArgs extends EntityEventArgs {
    IProjectile getProjectile();
}
