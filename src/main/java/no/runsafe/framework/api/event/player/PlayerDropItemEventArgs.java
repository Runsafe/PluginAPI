package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IItem;

public interface PlayerDropItemEventArgs extends PlayerEventArgs, CancellableEvent {
    IItem getItem();
}
