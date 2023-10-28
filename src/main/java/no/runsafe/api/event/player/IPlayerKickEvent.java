package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerKickEvent extends IRunsafeEvent
{
	void OnPlayerKick(PlayerKickEventArgs event);
}

