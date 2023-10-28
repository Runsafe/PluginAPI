package no.runsafe.api.event.player;

import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.player.IPlayer;

public interface PlayerCommandPreprocessEventArgs extends PlayerEventArgs, CancellableEvent {
    String getMessage();

    void setPlayer(IPlayer player);
}
