package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface IInventoryClosed extends IRunsafeEvent
{
	void OnInventoryClosed(InventoryCloseEventArgs event);
}

