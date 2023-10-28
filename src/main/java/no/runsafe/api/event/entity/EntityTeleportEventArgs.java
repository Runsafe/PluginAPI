package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.EventArgs;

public interface EntityTeleportEventArgs extends EventArgs {
    ILocation getFrom();

    void setFrom(ILocation from);

    ILocation getTo();

    void setTo(ILocation to);
}
