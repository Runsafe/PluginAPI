package no.runsafe.framework.api.entity.villagers;

import no.runsafe.framework.api.entity.IAgeable;
import no.runsafe.framework.api.entity.ICreature;

public interface IVillager extends IAgeable, ICreature
{
	void setProfession(VillagerProfession profession);
	VillagerProfession getProfession();
}