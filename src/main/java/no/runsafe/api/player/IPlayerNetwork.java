package no.runsafe.api.player;

import no.runsafe.api.networking.IPacket;

import javax.annotation.Nullable;
import java.net.InetSocketAddress;

public interface IPlayerNetwork
{
	@Nullable
	InetSocketAddress getAddress();
	@Nullable
	String getIP();

	void sendPacket(IPacket packet);
}
