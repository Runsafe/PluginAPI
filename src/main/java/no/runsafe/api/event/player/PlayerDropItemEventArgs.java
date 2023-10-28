package no.runsafe.api.event.player;

import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IItem;

public interface PlayerDropItemEventArgs extends PlayerEventArgs, CancellableEvent {
    IItem getItem();
}
