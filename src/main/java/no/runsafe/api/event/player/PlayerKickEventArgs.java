package no.runsafe.api.event.player;

import no.runsafe.api.event.IFakeableEvent;
import no.runsafe.api.player.IPlayer;

public interface PlayerKickEventArgs extends PlayerEventArgs, IFakeableEvent {
    String getLeaveMessage();

    void setLeaveMessage(String message);

    String getReason();

    void setReason(String reason);

    IPlayer getKicker();
}
