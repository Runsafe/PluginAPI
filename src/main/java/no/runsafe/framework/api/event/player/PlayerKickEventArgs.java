package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface PlayerKickEventArgs extends PlayerEventArgs, IFakeableEvent {
    String getLeaveMessage();

    void setLeaveMessage(String message);

    String getReason();

    void setReason(String reason);

    IPlayer getKicker();
}
