package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerChangedWorldEvent extends IRunsafeEvent
{
	void OnPlayerChangedWorld(PlayerChangedWorldEventArgs event);
}

