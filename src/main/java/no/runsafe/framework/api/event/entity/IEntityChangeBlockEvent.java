package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.item.IItem;

public interface IEntityChangeBlockEvent extends IRunsafeEvent
{
	void OnEntityChangeBlockEvent(EntityChangeBlockEventArgs event);
}
