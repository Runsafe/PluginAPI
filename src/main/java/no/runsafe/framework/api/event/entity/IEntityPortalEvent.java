package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

/**
 * Called when a non-player entity enters a portal.
 */
public interface IEntityPortalEvent extends IRunsafeEvent
{
	void OnEntityPortalEvent(EntityPortalEventArgs event);
}
