package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IBlockRedstone extends IRunsafeEvent
{
	void OnBlockRedstoneEvent(BlockRedstoneEventArgs event);
}

