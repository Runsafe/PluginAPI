package no.runsafe.api.command.argument;

import no.runsafe.api.player.IPlayer;

import java.util.List;

public interface ITabComplete
{
	List<String> getAlternatives(IPlayer executor, String partial);
}
