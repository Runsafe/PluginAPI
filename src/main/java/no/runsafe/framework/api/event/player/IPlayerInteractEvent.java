package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerInteractEvent extends IRunsafeEvent
{
    void OnPlayerInteractEvent(PlayerInteractEventArgs event);
}
