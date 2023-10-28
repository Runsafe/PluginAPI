package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerPreLoginEvent extends IRunsafeEvent
{
	void OnBeforePlayerLogin(PlayerPreLoginEventArgs event);
}


