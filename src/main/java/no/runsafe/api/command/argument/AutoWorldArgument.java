package no.runsafe.api.command.argument;

import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.player.IPlayerUniverse;

import javax.annotation.Nullable;

public class AutoWorldArgument extends WorldArgument
{
	@Nullable
	@Override
	public String expand(ICommandExecutor context, @Nullable String value)
	{
		if (value == null && context instanceof IPlayerUniverse)
			return ((IPlayerUniverse) context).getWorldName();
		return super.expand(context, value);
	}

	@Override
	public boolean isRequired()
	{
		return false;
	}
}
