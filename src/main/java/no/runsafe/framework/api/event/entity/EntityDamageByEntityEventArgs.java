package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.entity.IEntity;

public interface EntityDamageByEntityEventArgs extends EntityDamageEventArgs {
    IEntity getDamageActor();
}
