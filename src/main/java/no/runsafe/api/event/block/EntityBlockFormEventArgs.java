package no.runsafe.api.event.block;

import no.runsafe.api.entity.IEntity;
import no.runsafe.api.event.CancellableEvent;

public interface EntityBlockFormEventArgs extends BlockEventArgs, CancellableEvent {
    IEntity getEntity();
}
