package no.runsafe.framework.api.hook;

import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerNameDecorator extends IFrameworkHook
{
	/**
	 * Called by RunsafePlayer#getPrettyName() to decorate a player name for output
	 */
	String DecorateName(IPlayer player, String name);
}
