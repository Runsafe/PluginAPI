package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;


public interface IEntityPortalEnterEvent extends IRunsafeEvent
{
	void OnEntityPortalEnter(EntityPortalEnterEventArgs event);
}
