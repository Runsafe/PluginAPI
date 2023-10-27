package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface OperatorEventArgs extends PlayerEventArgs, CancellableEvent {
    boolean wasMadeOP();
}
