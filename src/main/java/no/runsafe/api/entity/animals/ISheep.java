package no.runsafe.api.entity.animals;

import no.runsafe.api.entity.IAnimal;
import no.runsafe.api.entity.IColourable;

public interface ISheep extends IAnimal, IColourable
{
	boolean isSheared();

	void setSheared(boolean sheared);
}
