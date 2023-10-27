package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;

public interface RunsafePlayerJoinEventArgs extends IFakeableEvent {
    String getJoinMessage();

    void setJoinMessage(String message);
}
