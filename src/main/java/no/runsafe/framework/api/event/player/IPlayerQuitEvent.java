package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerQuitEvent extends IRunsafeEvent
{
	void OnPlayerQuit(PlayerQuitEventArgs event);
}
