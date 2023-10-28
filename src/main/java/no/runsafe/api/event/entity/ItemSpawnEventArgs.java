package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;

public interface ItemSpawnEventArgs extends CancellableEntityEventArgs {
    ILocation getLocation();
}
