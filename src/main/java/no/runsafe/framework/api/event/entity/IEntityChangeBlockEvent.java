package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityChangeBlockEvent extends IRunsafeEvent
{
	void OnEntityChangeBlockEvent(EntityChangeBlockEventArgs event);
}
