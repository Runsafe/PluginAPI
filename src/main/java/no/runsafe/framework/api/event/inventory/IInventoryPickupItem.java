package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IInventoryPickupItem extends IRunsafeEvent
{
	void OnInventoryPickupItemEvent(InventoryPickupItemEventArgs event);
}
