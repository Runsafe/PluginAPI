package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IItem;
import no.runsafe.framework.api.item.IMeta;

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
