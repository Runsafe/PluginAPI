package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.player.IPlayer;

import java.util.ArrayList;
import java.util.List;

public interface IInventory extends IRunsafeEvent
{
	void OnInventoryEvent(InventoryEventArgs event);
}
