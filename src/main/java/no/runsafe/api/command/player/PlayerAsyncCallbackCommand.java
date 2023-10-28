package no.runsafe.api.command.player;

import no.runsafe.api.IScheduler;
import no.runsafe.api.command.IAsyncCallbackExecute;
import no.runsafe.api.command.argument.IArgument;
import no.runsafe.api.command.argument.IArgumentList;
import no.runsafe.api.log.IConsole;
import no.runsafe.api.command.AsyncCallbackCommand;
import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.player.IPlayer;

import javax.annotation.Nullable;

/**
 * Base class representing a command that can only be executed by a player and has an implementation that can be executed asynchronously with a return value
 * WARNING: Do not call bukkit APIs from the background thread!
 */
public abstract class PlayerAsyncCallbackCommand<T> extends AsyncCallbackCommand<T> implements IPlayerAsyncCallbackExecute<T>
{
	protected PlayerAsyncCallbackCommand(String name, String description, String permission, IScheduler scheduler, IArgument... args)
	{
		super(name, description, permission, scheduler, args);
	}

	@Override
	public final String OnExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		if (executor instanceof IConsole)
			return "This command cannot be used from the console.";
		return OnExecute((IPlayer) executor, parameters);
	}

	@Override
	@Nullable
	public final T OnAsyncExecute(ICommandExecutor executor, IArgumentList parameters)
	{
		if (executor instanceof IPlayer)
			return OnAsyncExecute((IPlayer) executor, parameters);
		return null;
	}

	/**
	 * This method is called on the main thread before {@link IAsyncCallbackExecute#OnAsyncExecute(ICommandExecutor, IArgumentList)}
	 *
	 *
	 * @param executor   The player executing the command
	 * @param parameters The arguments you defined in the constructor and their values as supplied by the user
	 * @return Message to show to the user running the command
	 */
	@Override
	@Nullable
	public String OnExecute(IPlayer executor, IArgumentList parameters)
	{
		return null;
	}
}
