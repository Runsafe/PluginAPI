package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityShootBowEvent extends IRunsafeEvent
{
    void OnEntityShootBowEvent(EntityShootBowEventArgs event);
}
