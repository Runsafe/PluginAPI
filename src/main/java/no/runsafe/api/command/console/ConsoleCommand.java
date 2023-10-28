package no.runsafe.api.command.console;

import no.runsafe.api.command.argument.IArgument;
import no.runsafe.api.command.argument.IArgumentList;
import no.runsafe.api.log.IConsole;
import no.runsafe.api.command.ExecutableCommand;
import no.runsafe.api.command.ICommandExecutor;

/**
 * Base class representing a command that can only be executed by the console
 */
public abstract class ConsoleCommand extends ExecutableCommand implements IConsoleExecute
{
	protected ConsoleCommand(String commandName, String description, IArgument... arguments)
	{
		super(commandName, description, null, arguments);
	}

	@Override
	public final String OnExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		if (executor instanceof IConsole)
			return OnExecute(parameters);

		return "This command must be used from the console.";
	}
}
