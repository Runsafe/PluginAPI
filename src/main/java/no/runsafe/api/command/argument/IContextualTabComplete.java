package no.runsafe.api.command.argument;

import no.runsafe.api.player.IPlayer;

import java.util.List;

public interface IContextualTabComplete
{
	List<String> getAlternatives(IPlayer executor, String partial, String... predecessors);
}
