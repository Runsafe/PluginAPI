package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.event.IRunsafeEvent;


public interface IBlockBreakEvent extends IRunsafeEvent
{
	void OnBlockBreakEvent(BlockBreakEventArgs event);
}
