package no.runsafe.api.event.player;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IMeta;

public interface PlayerClickEventArgs extends PlayerEventArgs, CancellableEvent {
    IBlock getBlock();
    IMeta getItemStack();
}
