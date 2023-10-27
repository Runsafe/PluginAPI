package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.item.IMeta;
import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerRightClick extends IRunsafeEvent
{
	boolean OnPlayerRightClick(IPlayer player, IMeta usingItem, IBlock targetBlock);
}

