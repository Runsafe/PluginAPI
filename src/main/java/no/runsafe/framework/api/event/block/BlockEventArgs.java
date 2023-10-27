package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface BlockEventArgs extends IRunsafeEvent {
    IBlock getBlock();
}
