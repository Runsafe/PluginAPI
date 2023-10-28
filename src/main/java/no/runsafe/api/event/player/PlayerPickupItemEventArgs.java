package no.runsafe.api.event.player;

import no.runsafe.api.item.IItem;
import no.runsafe.api.event.CancellableEvent;

public interface PlayerPickupItemEventArgs extends PlayerEventArgs, CancellableEvent {
    IItem getItem();
    int getRemaining();
}
