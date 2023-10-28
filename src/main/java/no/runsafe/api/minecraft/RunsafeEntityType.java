package no.runsafe.api.minecraft;

import no.runsafe.api.ILocation;
import no.runsafe.api.entity.IEntity;

public interface RunsafeEntityType
{
	String getName();

	int getId();

	boolean isAlive();

	boolean isSpawnAble();

	IEntity spawn(ILocation location);

	String getAPIName();
}
