package no.runsafe.framework.api.hook;

import no.runsafe.framework.api.player.IPlayer;

import java.time.ZonedDateTime;

public interface IPlayerSessionDataProvider extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#lastLogout() on behalf of plugins that
	 * want to find out when a player left the server
	 */
	ZonedDateTime GetPlayerLogout(IPlayer player);

	/**
	 * Called by RunsafePlayer#getBanReason() on behalf of plugins that
	 * want to know why a player was banned
	 */
	String GetPlayerBanReason(IPlayer player);

	/**
	 * Called by RunsafePlayer#isNew() on behalf of plugins that want to
	 * know if a player has connected for the first time
	 * Returning true asserts the user is new, false is unknown or not new
	 */
	boolean IsFirstSession(IPlayer player);
}
