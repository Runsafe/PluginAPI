package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.entity.ILivingEntity;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IMobSpawnerPulsed extends IRunsafeEvent
{
	boolean OnMobSpawnerPulsed(ILivingEntity entity, ILocation location);
}
