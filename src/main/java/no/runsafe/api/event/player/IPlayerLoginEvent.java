package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;


public interface IPlayerLoginEvent extends IRunsafeEvent
{
	void OnPlayerLogin(PlayerLoginEventArgs event);
}
