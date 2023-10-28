package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerInteractEntityEvent extends IRunsafeEvent
{
    void OnPlayerInteractEntityEvent(PlayerInteractEntityEventArgs event);
}
