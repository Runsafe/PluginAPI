package no.runsafe.api.command.argument;

import no.runsafe.api.player.IPlayer;

import java.time.Period;
import java.util.Map;

public class PeriodArgument extends CommandArgumentSpecification<Period>
{
	public PeriodArgument()
	{
		this("duration");
	}

	public PeriodArgument(String name)
	{
		super(name);
	}

	@Override
	public Period getValue(IPlayer context, Map<String, String> params)
	{
		String param = params.get(name);
		if (param == null || param.isEmpty())
			return defaultValue;
		try
		{
			return Period.parse(params.get(name));
		}
		catch (IllegalArgumentException e)
		{
			if (context != null)
				context.sendMessage("Unrecognized time format, use a text string such as PnYnMnD.");
			return null;
		}
	}

	@Override
	public boolean isWhitespaceInclusive()
	{
		return false;
	}
}
