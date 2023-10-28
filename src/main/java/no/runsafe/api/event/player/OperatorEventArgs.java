package no.runsafe.api.event.player;

import no.runsafe.api.event.CancellableEvent;

public interface OperatorEventArgs extends PlayerEventArgs, CancellableEvent {
    boolean wasMadeOP();
}
