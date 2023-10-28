package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityDamageEvent extends IRunsafeEvent
{
	void OnEntityDamage(EntityDamageEventArgs event);
}
