package no.runsafe.api.command.argument;

import java.util.Map;

public class MapRequired<T> extends MapArgument<T>
{
	public MapRequired(String name, Map<String, T> values)
	{
		super(name, values);
	}

	@Override
	public boolean isRequired()
	{
		return true;
	}
}
