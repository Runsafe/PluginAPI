package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;

public interface PlayerJoinEventArgs extends PlayerEventArgs, IFakeableEvent {
    String getJoinMessage();

    void setJoinMessage(String message);
}
