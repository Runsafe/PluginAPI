package no.runsafe.api.event.block;

import no.runsafe.api.event.IRunsafeEvent;

public interface IBlockPhysics extends IRunsafeEvent
{
	void OnBlockPhysics(CancellableBlockEventArgs event);
}
