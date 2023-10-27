package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.item.IItem;

public interface IPlayerPickupItemEvent extends IRunsafeEvent
{
	void OnPlayerPickupItemEvent(PlayerPickupItemEventArgs event);
}

