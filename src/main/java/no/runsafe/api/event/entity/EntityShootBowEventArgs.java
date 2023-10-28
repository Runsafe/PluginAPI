package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.entity.IEntity;

public interface EntityShootBowEventArgs extends EntityEventArgs {
    void setProjectile(IEntity entity);
    IEntity getProjectile();
}
