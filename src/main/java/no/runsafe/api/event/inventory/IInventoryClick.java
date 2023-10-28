package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface IInventoryClick extends IRunsafeEvent
{
	void OnInventoryClickEvent(InventoryClickEventArgs event);
}
