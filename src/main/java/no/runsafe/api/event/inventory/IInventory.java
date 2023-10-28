package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface IInventory extends IRunsafeEvent
{
	void OnInventoryEvent(InventoryEventArgs event);
}
