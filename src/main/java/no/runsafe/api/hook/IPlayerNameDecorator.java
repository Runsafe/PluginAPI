package no.runsafe.api.hook;

import no.runsafe.api.player.IPlayer;

public interface IPlayerNameDecorator extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#getPrettyName() to decorate a player name for output
	 */
	String DecorateName(IPlayer player, String name);
}
