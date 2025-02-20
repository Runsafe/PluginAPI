package no.runsafe.api.command.player;

import no.runsafe.api.command.argument.IArgumentList;
import no.runsafe.api.player.IPlayer;

public interface IPlayerExecute
{
	/**
	 * If you use optional arguments, you must still override this command, but you can leave it blank.
	 *
	 *
	 * @param executor   The player executing the command
	 * @param parameters The arguments you defined in the constructor and their values as supplied by the user
	 * @return Message to show to the user running the command
	 */
	String OnExecute(IPlayer executor, IArgumentList parameters);
}
