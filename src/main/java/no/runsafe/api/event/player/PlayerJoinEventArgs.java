package no.runsafe.api.event.player;

import no.runsafe.api.event.IFakeableEvent;

public interface PlayerJoinEventArgs extends PlayerEventArgs, IFakeableEvent {
    String getJoinMessage();

    void setJoinMessage(String message);
}
