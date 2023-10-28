package no.runsafe.api.entity.animals;

import no.runsafe.api.entity.IAnimal;
import no.runsafe.api.entity.ITameable;

public interface IOcelot extends IAnimal, ITameable
{
	OcelotType getCatType();
	boolean isSitting();
	void setCatType(OcelotType type);
	void setSitting(boolean sitting);
}
