package no.runsafe.api.event.entity;

import no.runsafe.api.entity.IEntity;

public interface EntityDamageByEntityEventArgs extends EntityDamageEventArgs {
    IEntity getDamageActor();
}
