package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerPreLoginEvent extends IRunsafeEvent
{
	void OnBeforePlayerLogin(PlayerPreLoginEventArgs event);
}


