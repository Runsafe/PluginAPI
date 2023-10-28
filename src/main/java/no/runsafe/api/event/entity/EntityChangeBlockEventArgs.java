package no.runsafe.api.event.entity;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IItem;

public interface EntityChangeBlockEventArgs extends CancellableEvent {
    IBlock getBlock();

    IItem getTo();

    byte getData();
}
