package no.runsafe.api.event.player;

import no.runsafe.api.entity.IEntity;
import no.runsafe.api.event.CancellableEvent;

public interface PlayerInteractEntityEventArgs extends PlayerEventArgs, CancellableEvent {
    IEntity getRightClicked();
}
