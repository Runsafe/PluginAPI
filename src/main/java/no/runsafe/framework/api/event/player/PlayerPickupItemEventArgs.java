package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IItem;

public interface PlayerPickupItemEventArgs extends PlayerEventArgs, CancellableEvent {
    IItem getItem();
    int getRemaining();
}
