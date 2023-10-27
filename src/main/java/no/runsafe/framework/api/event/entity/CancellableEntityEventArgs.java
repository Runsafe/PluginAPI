package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.player.EntityEventArgs;

public interface CancellableEntityEventArgs extends EntityEventArgs, CancellableEvent {
}
