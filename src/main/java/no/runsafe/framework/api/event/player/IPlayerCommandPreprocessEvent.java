package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerCommandPreprocessEvent extends IRunsafeEvent
{
	void OnBeforePlayerCommand(PlayerCommandPreprocessEventArgs event);
}

