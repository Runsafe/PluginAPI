package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityDamageByEntityEvent extends IRunsafeEvent
{
	void OnEntityDamageByEntity(EntityDamageByEntityEventArgs event);
}
