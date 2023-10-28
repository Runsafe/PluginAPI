package no.runsafe.api.networking;

import no.runsafe.api.player.IPlayer;

public interface IPacket
{
	void sendPacket(IPlayer player);
}
