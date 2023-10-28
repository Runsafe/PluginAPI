package no.runsafe.api.event.block;

import no.runsafe.api.item.IMeta;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.IRunsafeEvent;

public interface IBlockDispense extends IRunsafeEvent
{
	/**
	 * Respond to a block being dispensed
	 *
	 * @param block The block which was broken
	 * @param item  The item being dispensed
	 * @return If not an async event, whether to allow the event
	 */
	boolean OnBlockDispense(IBlock block, IMeta item);
}
