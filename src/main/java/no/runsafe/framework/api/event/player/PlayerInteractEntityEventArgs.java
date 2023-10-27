package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.CancellableEvent;

public interface PlayerInteractEntityEventArgs extends CancellableEvent {
    IEntity getRightClicked();
}
