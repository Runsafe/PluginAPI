package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

import java.util.List;

public interface IPlayerDeathEvent extends IRunsafeEvent
{
	void OnPlayerDeathEvent(PlayerDeathEventArgs event);
}
