package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerChatEvent extends IRunsafeEvent
{
    void OnPlayerChatEvent(PlayerChatEventArgs event);
}

