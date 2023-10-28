package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.event.CancellableEvent;

public interface CancellableEntityEventArgs extends EntityEventArgs, CancellableEvent {
}
