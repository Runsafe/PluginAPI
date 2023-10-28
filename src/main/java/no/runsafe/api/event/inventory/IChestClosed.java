package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IChestClosed extends IRunsafeEvent
{
	void OnChestClosed(IPlayer player, IInventory inventory);
}
