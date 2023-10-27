package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerInteractEntityEvent extends IRunsafeEvent
{
    void OnPlayerInteractEntityEvent(PlayerInteractEntityEventArgs event);
}
