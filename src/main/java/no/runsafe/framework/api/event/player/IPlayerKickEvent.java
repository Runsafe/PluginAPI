package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerKickEvent extends IRunsafeEvent
{
	void OnPlayerKick(PlayerKickEventArgs event);
}

