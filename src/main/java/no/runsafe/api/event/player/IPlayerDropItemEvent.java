package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerDropItemEvent extends IRunsafeEvent
{
	void OnPlayerDropItem(PlayerDropItemEventArgs event);
}
