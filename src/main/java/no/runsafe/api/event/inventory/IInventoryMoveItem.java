package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface IInventoryMoveItem extends IRunsafeEvent
{
	void OnInventoryMoveItemEvent(InventoryMoveItemEventArgs event);
}

