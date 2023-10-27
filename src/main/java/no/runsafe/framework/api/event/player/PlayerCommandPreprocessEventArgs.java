package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface PlayerCommandPreprocessEventArgs extends PlayerEventArgs, CancellableEvent {
    String getMessage();

    void setPlayer(IPlayer player);
}
