package no.runsafe.api.event.block;

import no.runsafe.api.event.IRunsafeEvent;

public interface IBlockRedstone extends IRunsafeEvent
{
	void OnBlockRedstoneEvent(BlockRedstoneEventArgs event);
}

