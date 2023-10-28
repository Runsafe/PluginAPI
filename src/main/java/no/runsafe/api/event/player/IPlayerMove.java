package no.runsafe.api.event.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPlayerMove extends IRunsafeEvent
{
	boolean OnPlayerMove(IPlayer player, ILocation from, ILocation to);
}
