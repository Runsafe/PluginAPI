package no.runsafe.api.hook;

import no.runsafe.api.player.IPlayer;

import java.util.Map;

public interface IPlayerDataProvider extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#getData() on behalf of plugins that
	 * want to find out various data about a player
	 */
	Map<String, String> GetPlayerData(IPlayer player);
}

