package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IItemDeSpawnEvent extends IRunsafeEvent
{
	boolean OnItemDeSpawn(ItemDeSpawnEventArgs event);
}
