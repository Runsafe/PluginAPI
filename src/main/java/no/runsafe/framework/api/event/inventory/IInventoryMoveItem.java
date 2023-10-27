package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IInventoryMoveItem extends IRunsafeEvent
{
	void OnInventoryMoveItemEvent(InventoryMoveItemEventArgs event);
}

