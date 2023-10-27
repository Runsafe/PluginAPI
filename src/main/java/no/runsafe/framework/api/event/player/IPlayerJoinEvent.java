package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerJoinEvent extends IRunsafeEvent
{
    void OnPlayerJoinEvent(PlayerJoinEventArgs event);
}
