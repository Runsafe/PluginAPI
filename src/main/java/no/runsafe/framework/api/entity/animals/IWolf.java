package no.runsafe.framework.api.entity.animals;

import no.runsafe.framework.api.entity.DyeColour;
import no.runsafe.framework.api.entity.IAnimal;
import no.runsafe.framework.api.entity.ITameable;

public interface IWolf extends IAnimal, ITameable
{
	DyeColour getCollarColour();
	boolean isAngry();
	boolean isSitting();
	void setCollarColour(DyeColour colour);
	void setSitting(boolean sitting);
	void setAngry(boolean angry);
}
