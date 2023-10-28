package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerDeathEvent extends IRunsafeEvent
{
	void OnPlayerDeathEvent(PlayerDeathEventArgs event);
}
