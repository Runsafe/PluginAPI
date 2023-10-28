package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IInventoryOpen extends IRunsafeEvent
{
	boolean OnInventoryOpen(IPlayer player, IInventory inventory);
}
