package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.block.ISign;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.item.IMeta;
import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerRightClickSign extends IRunsafeEvent
{
	boolean OnPlayerRightClickSign(IPlayer player, IMeta usingItem, ISign sign);
}
