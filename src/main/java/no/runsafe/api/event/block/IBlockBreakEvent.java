package no.runsafe.api.event.block;

import no.runsafe.api.event.IRunsafeEvent;


public interface IBlockBreakEvent extends IRunsafeEvent
{
	void OnBlockBreakEvent(BlockBreakEventArgs event);
}
