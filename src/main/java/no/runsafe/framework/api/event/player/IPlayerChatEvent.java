package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerChatEvent extends IRunsafeEvent
{
    void OnPlayerChatEvent(PlayerChatEventArgs event);
}

