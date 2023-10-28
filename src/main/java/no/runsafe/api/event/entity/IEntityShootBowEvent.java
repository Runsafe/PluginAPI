package no.runsafe.api.event.entity;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityShootBowEvent extends IRunsafeEvent
{
    void OnEntityShootBowEvent(EntityShootBowEventArgs event);
}
