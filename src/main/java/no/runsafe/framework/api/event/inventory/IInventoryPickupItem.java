package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.player.PlayerEventArgs;
import no.runsafe.framework.api.item.IItem;

public interface IInventoryPickupItem extends IRunsafeEvent
{
	void OnInventoryPickupItemEvent(InventoryPickupItemEventArgs event);
}
