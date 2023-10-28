package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.entity.ILivingEntity;
import no.runsafe.api.event.IRunsafeEvent;

public interface ISpawnEggUsed extends IRunsafeEvent
{
	boolean OnSpawnEggUsed(ILivingEntity entity, ILocation location);
}
