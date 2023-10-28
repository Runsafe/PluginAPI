package no.runsafe.api.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;

public interface IPlayerKinematics
{
	ILocation getLocation();

	void teleport(IWorld world, double x, double y, double z);

	void throwToPoint(ILocation location);

	void throwFromPoint(ILocation location);
}
