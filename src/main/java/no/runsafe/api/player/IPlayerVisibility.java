package no.runsafe.api.player;

import javax.annotation.Nonnull;

public interface IPlayerVisibility
{
	boolean shouldNotSee(@Nonnull IPlayer target);

	boolean isVanished();
}
