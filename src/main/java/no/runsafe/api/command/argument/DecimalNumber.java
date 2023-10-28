package no.runsafe.api.command.argument;

import no.runsafe.api.player.IPlayer;

import java.util.Map;

public class DecimalNumber extends CommandArgumentSpecification<Float>
{
	public DecimalNumber(String name)
	{
		super(name);
	}

	@Override
	public boolean isWhitespaceInclusive()
	{
		return false;
	}

	@Override
	public Float getValue(IPlayer context, Map<String, String> params)
	{
		try
		{
			if (params.get(name) == null || params.get(name).isEmpty())
				return defaultValue;
			return Float.parseFloat(params.get(name));
		}
		catch (NumberFormatException e)
		{
			return defaultValue;
		}
	}
}
