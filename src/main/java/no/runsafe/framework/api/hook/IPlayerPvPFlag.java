package no.runsafe.framework.api.hook;

import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerPvPFlag extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#isPvPFlagged() for plugins controlling pvp actions
	 */
	boolean isPvPDisabled(IPlayer player);
}
