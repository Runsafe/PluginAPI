package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.player.EntityEventArgs;

public interface EntityShootBowEventArgs extends EntityEventArgs {
    void setProjectile(IEntity entity);
    IEntity getProjectile();
}
