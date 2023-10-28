package no.runsafe.api.event.world;

import no.runsafe.api.IWorld;
import no.runsafe.api.event.IRunsafeEvent;

public interface IWorldLoad extends IRunsafeEvent
{
	void OnWorldLoad(IWorld world);
}
