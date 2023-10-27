package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IBlockPhysics extends IRunsafeEvent
{
	void OnBlockPhysics(CancellableBlockEventArgs event);
}
