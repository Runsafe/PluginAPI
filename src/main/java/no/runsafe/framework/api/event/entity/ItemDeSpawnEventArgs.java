package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.player.EntityEventArgs;

public interface ItemDeSpawnEventArgs extends EntityEventArgs, CancellableEvent {
    ILocation getLocation();
}
