package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IItemSpawn extends IRunsafeEvent
{
	void OnItemSpawn(ItemSpawnEventArgs event);
}
