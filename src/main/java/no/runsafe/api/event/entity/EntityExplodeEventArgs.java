package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.CancellableEvent;

import java.util.List;

public interface EntityExplodeEventArgs extends EntityEventArgs, CancellableEvent {
    float getYield();
    void setYield(float yield);
    List<IBlock> getBlockList();
}
