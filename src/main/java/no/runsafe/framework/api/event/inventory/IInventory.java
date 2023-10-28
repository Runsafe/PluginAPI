package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IInventory extends IRunsafeEvent
{
	void OnInventoryEvent(InventoryEventArgs event);
}
