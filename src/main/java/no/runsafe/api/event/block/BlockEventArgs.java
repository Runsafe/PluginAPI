package no.runsafe.api.event.block;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.IRunsafeEvent;

public interface BlockEventArgs extends IRunsafeEvent {
    IBlock getBlock();
}
