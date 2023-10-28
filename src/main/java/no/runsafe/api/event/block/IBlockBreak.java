package no.runsafe.api.event.block;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IBlockBreak extends IRunsafeEvent
{
	/**
	 * Respond to a user breaking a block
	 *
	 * @param player The player that broke the block
	 * @param block  The block which was broken
	 * @return If not an async event, whether to allow the event
	 */
	boolean OnBlockBreak(IPlayer player, IBlock block);
}
