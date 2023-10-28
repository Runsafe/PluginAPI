package no.runsafe.api.event.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.CancellableEvent;

public interface PlayerMoveEventArgs extends PlayerEventArgs, CancellableEvent {
    ILocation getFrom();

    void setFrom(ILocation location);

    ILocation getTo();

    void setTo(ILocation location);
}
