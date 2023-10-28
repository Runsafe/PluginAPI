package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityCreatePortalEvent extends IRunsafeEvent
{
	void OnEntityCreatePortal(EntityCreatePortalEventArgs event);
}

