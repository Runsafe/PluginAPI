package no.runsafe.api.hook;

import no.runsafe.api.player.IPlayer;

public interface IPlayerPvPFlag extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#isPvPFlagged() for plugins controlling pvp actions
	 */
	boolean isPvPDisabled(IPlayer player);
}
