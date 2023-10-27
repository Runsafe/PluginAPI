package no.runsafe.framework.api.entity.animals;

import no.runsafe.framework.api.entity.IAnimal;
import no.runsafe.framework.api.entity.ITameable;

public interface IOcelot extends IAnimal, ITameable
{
	OcelotType getCatType();
	boolean isSitting();
	void setCatType(OcelotType type);
	void setSitting(boolean sitting);
}
