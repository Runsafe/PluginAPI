package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.entity.ILivingEntity;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface ISpawnEggUsed extends IRunsafeEvent
{
	boolean OnSpawnEggUsed(ILivingEntity entity, ILocation location);
}
