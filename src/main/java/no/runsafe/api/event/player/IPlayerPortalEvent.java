package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerPortalEvent extends IRunsafeEvent
{
	void OnPlayerPortalEvent(PlayerPortalEventArgs event);
}
