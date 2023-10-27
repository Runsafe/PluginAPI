package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.player.EntityEventArgs;

public interface IEntityCreatePortalEvent extends IRunsafeEvent
{
	void OnEntityCreatePortal(EntityCreatePortalEventArgs event);
}

