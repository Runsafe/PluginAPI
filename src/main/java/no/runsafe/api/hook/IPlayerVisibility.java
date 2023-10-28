package no.runsafe.api.hook;

import no.runsafe.api.player.IPlayer;

public interface IPlayerVisibility extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#shouldNotSee(IPlayer) to test if a player should be aware of someone else or not
	 */
	boolean isPlayerHidden(IPlayer viewer, IPlayer target);

	/**
	 * Called by RunsafePlayer#isVanished() to test if a player has vanished or not
	 */
	boolean isPlayerVanished(IPlayer player);
}
