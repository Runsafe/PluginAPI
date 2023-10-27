package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.player.EntityEventArgs;

import java.util.List;

public interface IEntityExplode extends IRunsafeEvent
{
	void OnEntityExplode(EntityExplodeEventArgs event);
}

