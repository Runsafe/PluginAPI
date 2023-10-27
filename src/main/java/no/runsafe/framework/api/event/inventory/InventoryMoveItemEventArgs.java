package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IMeta;

public interface InventoryMoveItemEventArgs extends CancellableEvent {
    IInventory getSource();

    IInventory getDestination();

    IMeta getItem();

    void setItem(IMeta item);

    IInventory getInitiator();
}
