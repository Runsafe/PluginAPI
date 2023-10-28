package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IChestOpen extends IRunsafeEvent
{
	boolean OnChestOpen(IPlayer player, IInventory inventory);
}
