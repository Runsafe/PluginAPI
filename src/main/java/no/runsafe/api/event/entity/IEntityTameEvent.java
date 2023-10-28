package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityTameEvent extends IRunsafeEvent
{
	void OnEntityTame(EntityTameEventArgs event);
}
