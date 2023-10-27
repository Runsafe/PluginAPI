package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IItemDespawnEvent extends IRunsafeEvent
{
	boolean OnItemDespawn(ItemDeSpawnEventArgs event);
}
