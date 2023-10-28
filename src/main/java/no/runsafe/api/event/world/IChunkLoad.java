package no.runsafe.api.event.world;

import no.runsafe.api.chunk.IChunk;
import no.runsafe.api.event.IRunsafeEvent;

public interface IChunkLoad extends IRunsafeEvent
{
	void OnChunkLoad(IChunk chunk);
}

