package no.runsafe.api.command.player;

import no.runsafe.api.command.argument.IArgumentList;
import no.runsafe.api.player.IPlayer;

public interface IPlayerAsyncCallbackExecute<T> extends IPlayerExecute
{
	/**
	 * If you use optional arguments, you still need to override this, but you can leave it empty.
	 *
	 *
	 * @param executor   The player executing the command
	 * @param parameters The arguments you defined in the constructor and their values as supplied by the user
	 * @return Message to show to the user running the command
	 */
	T OnAsyncExecute(IPlayer executor, IArgumentList parameters);
}
