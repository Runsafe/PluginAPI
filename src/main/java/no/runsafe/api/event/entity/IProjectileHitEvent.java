package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IProjectileHitEvent extends IRunsafeEvent
{
	void OnProjectileHit(ProjectileHitEventArgs event);
}
