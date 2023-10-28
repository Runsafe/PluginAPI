package no.runsafe.api.command.player;

import no.runsafe.api.command.argument.IArgument;
import no.runsafe.api.command.argument.IArgumentList;
import no.runsafe.api.command.ExecutableCommand;
import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.player.IPlayer;

/**
 * Base class representing a command that can only be executed by a player
 */
public abstract class PlayerCommand extends ExecutableCommand implements IPlayerExecute
{
	protected PlayerCommand(String commandName, String description, String permission, IArgument... arguments)
	{
		super(commandName, description, permission, arguments);
	}

	@Override
	public final String OnExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		if (executor instanceof IPlayer)
			return OnExecute((IPlayer) executor, parameters);

		return "This command cannot be used from the console.";
	}
}
