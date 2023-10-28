package no.runsafe.api.command.argument;

import no.runsafe.api.player.IPlayer;

import java.util.Map;

public class WholeNumber extends CommandArgumentSpecification<Integer>
{
	public WholeNumber(String name)
	{
		super(name);
	}

	@Override
	public boolean isWhitespaceInclusive()
	{
		return false;
	}

	@Override
	public Integer getValue(IPlayer context, Map<String, String> params)
	{
		try
		{
			if (params.get(name) == null || params.get(name).isEmpty())
				return defaultValue;
			return Integer.parseInt(params.get(name));
		}
		catch (NumberFormatException e)
		{
			return defaultValue;
		}
	}
}
