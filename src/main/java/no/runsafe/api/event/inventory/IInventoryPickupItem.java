package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface IInventoryPickupItem extends IRunsafeEvent
{
	void OnInventoryPickupItemEvent(InventoryPickupItemEventArgs event);
}
