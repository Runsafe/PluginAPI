package no.runsafe.api.server;

import no.runsafe.api.IWorld;

import javax.annotation.Nullable;
import java.io.File;
import java.util.List;
import java.util.UUID;

public interface IWorldManager
{
	@Nullable
    IWorld getWorld(String worldName);

	@Nullable
	IWorld getWorld(UUID uid);

	List<IWorld> getWorlds();

	boolean getAllowEnd();

	boolean getAllowNether();

	boolean unloadWorld(String worldName, boolean save);

	boolean unloadWorld(IWorld world, boolean save);

	File getWorldContainer();

	String getWorldType();
}
