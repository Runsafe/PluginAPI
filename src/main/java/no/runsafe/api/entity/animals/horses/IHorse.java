package no.runsafe.api.entity.animals.horses;

import no.runsafe.api.entity.IAnimal;
import no.runsafe.api.entity.ITameable;

public interface IHorse extends IAnimal, ITameable
{
	int getDomestication();

	void setDomestication(int level);

	int getMaxDomestication();

	void setMaxDomestication(int maxDomestication);

	double getJumpStrength();

	void setJumpStrength(double jumpStrength);
}
