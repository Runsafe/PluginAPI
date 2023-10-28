package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.PlayerEventArgs;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.minecraft.IAnimalTamer;

public interface EntityTameEventArgs extends PlayerEventArgs, CancellableEvent {
    IAnimalTamer getOwner();
}
