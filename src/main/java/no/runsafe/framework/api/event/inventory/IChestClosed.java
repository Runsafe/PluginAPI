package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface IChestClosed extends IRunsafeEvent
{
	void OnChestClosed(IPlayer player, IInventory inventory);
}
