package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerDropItemEvent extends IRunsafeEvent
{
	void OnPlayerDropItem(PlayerDropItemEventArgs event);
}
