package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.event.EventArgs;

public interface EntityTeleportEventArgs extends EventArgs {
    ILocation getFrom();

    void setFrom(ILocation from);

    ILocation getTo();

    void setTo(ILocation to);
}
