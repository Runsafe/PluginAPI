package no.runsafe.api.entity;

import no.runsafe.api.minecraft.IAnimalTamer;

public interface ITameable
{
	boolean isTamed();
	void setTamed(boolean tamed);
	void setOwner(IAnimalTamer tamer);
	IAnimalTamer getOwner();
}
