package no.runsafe.api.server;

import no.runsafe.api.player.IPlayer;

import java.util.List;

public interface IWhitelistManager
{
	List<IPlayer> getWhitelistedPlayers();

	boolean hasWhitelist();

	void reloadWhitelist();

	void setWhitelist(boolean value);
}
