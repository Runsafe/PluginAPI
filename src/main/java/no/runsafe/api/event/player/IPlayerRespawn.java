package no.runsafe.api.event.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPlayerRespawn extends IRunsafeEvent
{
	ILocation OnPlayerRespawn(IPlayer player, ILocation location, boolean isBed);
}
