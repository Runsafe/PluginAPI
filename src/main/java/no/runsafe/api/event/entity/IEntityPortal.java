package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.entity.IEntity;
import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityPortal extends IRunsafeEvent
{
	boolean OnEntityPortal(IEntity player, ILocation from, ILocation to);
}
