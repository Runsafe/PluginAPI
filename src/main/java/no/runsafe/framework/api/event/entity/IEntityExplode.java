package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityExplode extends IRunsafeEvent
{
	void OnEntityExplode(EntityExplodeEventArgs event);
}

