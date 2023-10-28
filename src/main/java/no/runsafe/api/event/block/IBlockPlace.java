package no.runsafe.api.event.block;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IBlockPlace extends IRunsafeEvent
{
	/**
	 * Respond to a player placing a block
	 *
	 * @param player The player placing the block
	 * @param block  The block being placed
	 * @return If not an async event, whether to allow the event
	 */
	boolean OnBlockPlace(IPlayer player, IBlock block);
}
