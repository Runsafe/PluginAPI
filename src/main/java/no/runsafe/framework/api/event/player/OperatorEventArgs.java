package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.CancellableEvent;

public interface OperatorEventArgs extends PlayerEventArgs, CancellableEvent {
    boolean wasMadeOP();
}
