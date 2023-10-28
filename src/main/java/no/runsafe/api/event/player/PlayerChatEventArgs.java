package no.runsafe.api.event.player;

import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.event.IFakeableEvent;
import no.runsafe.api.player.IPlayer;

import java.util.List;

public interface PlayerChatEventArgs extends PlayerEventArgs, CancellableEvent, IFakeableEvent {
    String getFormat();

    void setFormat(String format);

    String getMessage();

    void setMessage(String message);

    List<IPlayer> getRecipients();
}
