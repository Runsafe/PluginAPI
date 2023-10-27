package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

/**
 * Called when a non-player entity tries to teleport.
 */
public interface IEntityTeleportEvent extends IRunsafeEvent
{
	void OnEntityTeleport(EntityTeleportEventArgs event);
}
