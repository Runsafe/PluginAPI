package no.runsafe.api.event.inventory;

import no.runsafe.api.item.IMeta;
import no.runsafe.api.event.CancellableEvent;

public interface InventoryMoveItemEventArgs extends CancellableEvent {
    IInventory getSource();

    IInventory getDestination();

    IMeta getItem();

    void setItem(IMeta item);

    IInventory getInitiator();
}
