package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;

public interface EntityTeleportEventArgs {
    ILocation getFrom();

    void setFrom(ILocation from);

    ILocation getTo();

    void setTo(ILocation to);
}
