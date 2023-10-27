package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerJoinEvent extends IRunsafeEvent
{
    void OnPlayerJoinEvent(RunsafePlayerJoinEventArgs event);
}
