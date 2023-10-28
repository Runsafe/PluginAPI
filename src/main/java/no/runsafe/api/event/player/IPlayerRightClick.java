package no.runsafe.api.event.player;

import no.runsafe.api.item.IMeta;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPlayerRightClick extends IRunsafeEvent
{
	boolean OnPlayerRightClick(IPlayer player, IMeta usingItem, IBlock targetBlock);
}

