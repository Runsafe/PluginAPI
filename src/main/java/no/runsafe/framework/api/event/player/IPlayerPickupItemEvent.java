package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerPickupItemEvent extends IRunsafeEvent
{
	void OnPlayerPickupItemEvent(PlayerPickupItemEventArgs event);
}

