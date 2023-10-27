package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.player.PlayerEventArgs;
import no.runsafe.framework.api.minecraft.IAnimalTamer;

public interface EntityTameEventArgs extends PlayerEventArgs, CancellableEvent {
    IAnimalTamer getOwner();
}
