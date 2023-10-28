package no.runsafe.api.player;

public interface IAmbiguousPlayer extends IPlayer
{
	Iterable<String> getAmbiguity();
}
