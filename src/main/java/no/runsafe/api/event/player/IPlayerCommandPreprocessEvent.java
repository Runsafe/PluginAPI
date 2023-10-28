package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerCommandPreprocessEvent extends IRunsafeEvent
{
	void OnBeforePlayerCommand(PlayerCommandPreprocessEventArgs event);
}

