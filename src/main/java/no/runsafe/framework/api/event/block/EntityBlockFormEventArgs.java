package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.CancellableEvent;

public interface EntityBlockFormEventArgs extends BlockEventArgs, CancellableEvent {
    IEntity getEntity();
}
