package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityCreatePortalEvent extends IRunsafeEvent
{
	void OnEntityCreatePortal(EntityCreatePortalEventArgs event);
}

