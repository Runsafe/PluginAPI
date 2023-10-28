package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerDeathEvent extends IRunsafeEvent
{
	void OnPlayerDeathEvent(PlayerDeathEventArgs event);
}
