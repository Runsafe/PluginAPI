package no.runsafe.api.server;

public interface IBroadcast
{
	int broadcastMessage(String message, String permission);

	int broadcastMessage(String message);
}
