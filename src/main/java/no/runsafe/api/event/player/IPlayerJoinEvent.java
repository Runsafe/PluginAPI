package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerJoinEvent extends IRunsafeEvent
{
    void OnPlayerJoinEvent(PlayerJoinEventArgs event);
}
