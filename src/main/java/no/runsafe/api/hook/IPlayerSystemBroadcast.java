package no.runsafe.api.hook;

import no.runsafe.api.player.IPlayer;

public interface IPlayerSystemBroadcast extends IFrameworkHook
{
	void sendPlayerSystemBroadcast(IPlayer player, String message);
}
