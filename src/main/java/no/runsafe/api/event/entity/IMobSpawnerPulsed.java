package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.entity.ILivingEntity;
import no.runsafe.api.event.IRunsafeEvent;

public interface IMobSpawnerPulsed extends IRunsafeEvent
{
	boolean OnMobSpawnerPulsed(ILivingEntity entity, ILocation location);
}
