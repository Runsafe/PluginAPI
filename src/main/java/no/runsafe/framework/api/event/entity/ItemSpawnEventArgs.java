package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;

public interface ItemSpawnEventArgs extends CancellableEntityEventArgs {
    ILocation getLocation();
}
