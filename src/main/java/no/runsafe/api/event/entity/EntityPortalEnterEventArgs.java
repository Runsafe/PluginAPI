package no.runsafe.api.event.entity;

import no.runsafe.api.ILocation;
import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.block.IBlock;

public interface EntityPortalEnterEventArgs extends EntityEventArgs {
    ILocation getLocation();

    IBlock getBlock();
}
