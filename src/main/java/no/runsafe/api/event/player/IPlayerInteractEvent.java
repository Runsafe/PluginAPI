package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerInteractEvent extends IRunsafeEvent
{
    void OnPlayerInteractEvent(PlayerInteractEventArgs event);
}
