package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IInventoryClosed extends IRunsafeEvent
{
	void OnInventoryClosed(InventoryCloseEventArgs event);
}

