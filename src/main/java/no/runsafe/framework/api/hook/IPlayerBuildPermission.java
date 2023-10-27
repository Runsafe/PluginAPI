package no.runsafe.framework.api.hook;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerBuildPermission extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#canBuildNow() on behalf of plugins that
	 * want to find out if the player can build or not
	 */
	boolean blockPlayerBuilding(IPlayer player, ILocation location);
}
