package no.runsafe.api.event.block;

import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.player.IPlayer;

public interface BlockBreakEventArgs extends BlockEventArgs, CancellableEvent {
    IPlayer getPlayer();

    void setXP(int xp);
}
