package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerPortalEvent extends IRunsafeEvent
{
	void OnPlayerPortalEvent(PlayerPortalEventArgs event);
}
