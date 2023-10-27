package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityDamageEvent extends IRunsafeEvent
{
	void OnEntityDamage(EntityDamageEventArgs event);
}
