package no.runsafe.api.event.inventory;

import no.runsafe.api.event.player.PlayerEventArgs;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IItem;

public interface InventoryPickupItemEventArgs extends PlayerEventArgs, CancellableEvent {
    IInventory getInventory();
    IItem getItem();
}
