package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface IChestOpen extends IRunsafeEvent
{
	boolean OnChestOpen(IPlayer player, IInventory inventory);
}
