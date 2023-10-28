package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityDamageByEntityEvent extends IRunsafeEvent
{
	void OnEntityDamageByEntity(EntityDamageByEntityEventArgs event);
}
