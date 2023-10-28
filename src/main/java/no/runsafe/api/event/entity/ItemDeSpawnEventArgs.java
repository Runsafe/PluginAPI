package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.event.CancellableEvent;

public interface ItemDeSpawnEventArgs extends EntityEventArgs, CancellableEvent {
    ILocation getLocation();
}
