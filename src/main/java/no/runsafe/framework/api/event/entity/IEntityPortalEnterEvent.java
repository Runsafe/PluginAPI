package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.player.EntityEventArgs;


public interface IEntityPortalEnterEvent extends IRunsafeEvent
{
	void OnEntityPortalEnter(EntityPortalEnterEventArgs event);
}
