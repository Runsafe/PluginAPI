package no.runsafe.framework.api.event.world;

import no.runsafe.framework.api.chunk.IChunk;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IChunkPopulate extends IRunsafeEvent
{
	void OnChunkPopulate(IChunk chunk);
}
