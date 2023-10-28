package no.runsafe.api.event.world;

import no.runsafe.api.chunk.IChunk;
import no.runsafe.api.event.IRunsafeEvent;

public interface IChunkPopulate extends IRunsafeEvent
{
	void OnChunkPopulate(IChunk chunk);
}
