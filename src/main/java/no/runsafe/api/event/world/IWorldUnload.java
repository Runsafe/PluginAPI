package no.runsafe.api.event.world;

import no.runsafe.api.IWorld;
import no.runsafe.api.event.IRunsafeEvent;

public interface IWorldUnload extends IRunsafeEvent
{
	void OnWorldUnload(IWorld world);
}
