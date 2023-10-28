package no.runsafe.framework.api.minecraft;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.entity.IEntity;

public interface RunsafeEntityType
{
	String getName();

	int getId();

	boolean isAlive();

	boolean isSpawnAble();

	IEntity spawn(ILocation location);

	String getAPIName();
}
