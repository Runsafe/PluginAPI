package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IItem;

public interface EntityChangeBlockEventArgs extends CancellableEvent {
    IBlock getBlock();

    IItem getTo();

    byte getData();
}
