package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.player.PlayerEventArgs;
import no.runsafe.framework.api.item.IItem;

public interface InventoryPickupItemEventArgs extends PlayerEventArgs, CancellableEvent {
    IInventory getInventory();
    IItem getItem();
}
