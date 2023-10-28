package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.EntityDeathEventArgs;
import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityDeathEvent extends IRunsafeEvent
{
	void OnEntityDeath(EntityDeathEventArgs event);
}
