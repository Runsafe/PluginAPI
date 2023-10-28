package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;


public interface IEntityPortalEnterEvent extends IRunsafeEvent
{
	void OnEntityPortalEnter(EntityPortalEnterEventArgs event);
}
