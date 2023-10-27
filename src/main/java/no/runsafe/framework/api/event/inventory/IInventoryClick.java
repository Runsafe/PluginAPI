package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IInventoryClick extends IRunsafeEvent
{
	void OnInventoryClickEvent(InventoryClickEventArgs event);
}
