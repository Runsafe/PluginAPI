package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IItemSpawn extends IRunsafeEvent
{
	void OnItemSpawn(ItemSpawnEventArgs event);
}
