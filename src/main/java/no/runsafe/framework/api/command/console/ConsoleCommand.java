package no.runsafe.framework.api.command.console;

import no.runsafe.framework.api.command.ExecutableCommand;
import no.runsafe.framework.api.command.ICommandExecutor;
import no.runsafe.framework.api.command.argument.IArgument;
import no.runsafe.framework.api.command.argument.IArgumentList;
import no.runsafe.framework.api.log.IConsole;

/**
 * Base class representing a command that can only be executed by the console
 */
public abstract class ConsoleCommand extends ExecutableCommand implements IConsoleExecute
{
	protected ConsoleCommand(String commandName, String description, IArgument... arguments)
	{
		super(commandName, description, null, arguments);
	}

	@SuppressWarnings("InstanceofInterfaces")
	@Override
	public final String OnExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		if (executor instanceof IConsole)
			return OnExecute(parameters);

		return "This command must be used from the console.";
	}
}
