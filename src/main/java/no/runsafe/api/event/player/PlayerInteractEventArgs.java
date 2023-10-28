package no.runsafe.api.event.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IItem;
import no.runsafe.api.item.IMeta;

public interface PlayerInteractEventArgs extends PlayerEventArgs, CancellableEvent {
    boolean isRightClick();

    boolean isLeftClick();

    boolean hasItem();

    IItem getMaterial();

    boolean hasBlock();

    boolean isBlockInHand();

    IBlock getBlock();

    IMeta getItemStack();

    void removeItemStack();

    ILocation getTargetBlock();
}
