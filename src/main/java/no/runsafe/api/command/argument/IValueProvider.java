package no.runsafe.api.command.argument;

import no.runsafe.api.player.IPlayer;

import java.util.Map;

public interface IValueProvider<T>
{
	T getValue(IPlayer context, Map<String, String> params);
}
