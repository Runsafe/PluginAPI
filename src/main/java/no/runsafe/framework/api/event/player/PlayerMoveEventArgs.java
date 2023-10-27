package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.event.CancellableEvent;

public interface PlayerMoveEventArgs extends PlayerEventArgs, CancellableEvent {
    ILocation getFrom();

    void setFrom(ILocation location);

    ILocation getTo();

    void setTo(ILocation location);
}
