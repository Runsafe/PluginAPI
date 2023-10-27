package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.player.EntityDeathEventArgs;

public interface IEntityDeathEvent extends IRunsafeEvent
{
	void OnEntityDeath(EntityDeathEventArgs event);
}
