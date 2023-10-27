package no.runsafe.framework.api.hook;

import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerSeen extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#getLastSeen(IPlayer) to get their last seen time.
	 */
	String GetLastSeen(IPlayer player, IPlayer checker);
}
