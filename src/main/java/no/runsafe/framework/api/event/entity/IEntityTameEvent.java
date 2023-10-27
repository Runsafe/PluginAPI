package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityTameEvent extends IRunsafeEvent
{
	void OnEntityTame(EntityTameEventArgs event);
}
