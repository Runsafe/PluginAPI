package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerInteractEntityEvent extends IRunsafeEvent
{
    void OnPlayerInteractEntityEvent(PlayerInteractEntityEventArgs event);
}
