package no.runsafe.framework.api.minecraft;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.entity.IEntity;

public interface RunsafeEntityType
{
	String getName();

	int getId();

	boolean isAlive();

	boolean isSpawnable();

	IEntity spawn(ILocation location);

	String getAPIName();
}
