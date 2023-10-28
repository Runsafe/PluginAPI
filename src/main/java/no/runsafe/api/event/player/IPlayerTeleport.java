package no.runsafe.api.event.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPlayerTeleport extends IRunsafeEvent
{
	boolean OnPlayerTeleport(IPlayer player, ILocation from, ILocation to);
}
