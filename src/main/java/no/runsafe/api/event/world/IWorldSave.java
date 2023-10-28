package no.runsafe.api.event.world;

import no.runsafe.api.IWorld;
import no.runsafe.api.event.IRunsafeEvent;

public interface IWorldSave extends IRunsafeEvent
{
	void OnWorldSave(IWorld world);
}
