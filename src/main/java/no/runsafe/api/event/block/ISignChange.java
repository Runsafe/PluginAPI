package no.runsafe.api.event.block;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface ISignChange extends IRunsafeEvent
{
	/**
	 * Respond to a user changing a sign
	 *
	 * @param player The player that changed the sign
	 * @param block  The sign block that was changed
	 * @return If not an async event, whether to allow the event
	 */
	boolean OnSignChange(IPlayer player, IBlock block, String... text);
}
