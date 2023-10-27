package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface BlockBreakEventArgs extends BlockEventArgs, CancellableEvent {
    IPlayer getPlayer();

    void setXP(int xp);
}
