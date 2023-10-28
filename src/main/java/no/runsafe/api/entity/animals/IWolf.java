package no.runsafe.api.entity.animals;

import no.runsafe.api.entity.DyeColour;
import no.runsafe.api.entity.IAnimal;
import no.runsafe.api.entity.ITameable;

public interface IWolf extends IAnimal, ITameable
{
	DyeColour getCollarColour();
	boolean isAngry();
	boolean isSitting();
	void setCollarColour(DyeColour colour);
	void setSitting(boolean sitting);
	void setAngry(boolean angry);
}
