package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IMeta;

public interface PlayerClickEventArgs extends PlayerEventArgs, CancellableEvent {
    IBlock getBlock();
    IMeta getItemStack();
}
