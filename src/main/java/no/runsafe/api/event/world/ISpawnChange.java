package no.runsafe.api.event.world;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;
import no.runsafe.api.event.IRunsafeEvent;

public interface ISpawnChange extends IRunsafeEvent
{
	void OnSpawnChange(IWorld world, ILocation from);
}
