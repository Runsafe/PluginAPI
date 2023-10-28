package no.runsafe.api.event.player;

import no.runsafe.api.event.IFakeableEvent;

public interface PlayerQuitEventArgs extends PlayerEventArgs, IFakeableEvent {
    String getQuitMessage();

    void setQuitMessage(String message);
}
