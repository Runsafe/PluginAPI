package no.runsafe.api.player;

import no.runsafe.api.IUniverse;

import javax.annotation.Nullable;

public interface IPlayerUniverse
{
	@Nullable
    IUniverse getUniverse();
	boolean isInUniverse(String universeName);
	String getWorldName();
}
