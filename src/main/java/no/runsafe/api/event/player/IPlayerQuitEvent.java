package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerQuitEvent extends IRunsafeEvent
{
	void OnPlayerQuit(PlayerQuitEventArgs event);
}
