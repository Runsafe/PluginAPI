package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IItemDeSpawnEvent extends IRunsafeEvent
{
	boolean OnItemDeSpawn(ItemDeSpawnEventArgs event);
}
