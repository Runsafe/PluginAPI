package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;

public interface PlayerQuitEventArgs extends PlayerEventArgs, IFakeableEvent {
    String getQuitMessage();

    void setQuitMessage(String message);
}
