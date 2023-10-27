package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IProjectileHitEvent extends IRunsafeEvent
{
	void OnProjectileHit(ProjectileHitEventArgs event);
}
