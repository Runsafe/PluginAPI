package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityExplode extends IRunsafeEvent
{
	void OnEntityExplode(EntityExplodeEventArgs event);
}

