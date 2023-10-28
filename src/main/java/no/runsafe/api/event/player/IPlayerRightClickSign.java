package no.runsafe.api.event.player;

import no.runsafe.api.item.IMeta;
import no.runsafe.api.block.ISign;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPlayerRightClickSign extends IRunsafeEvent
{
	boolean OnPlayerRightClickSign(IPlayer player, IMeta usingItem, ISign sign);
}
