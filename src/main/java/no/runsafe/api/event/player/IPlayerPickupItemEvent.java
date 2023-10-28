package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerPickupItemEvent extends IRunsafeEvent
{
	void OnPlayerPickupItemEvent(PlayerPickupItemEventArgs event);
}

