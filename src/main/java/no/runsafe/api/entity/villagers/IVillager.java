package no.runsafe.api.entity.villagers;

import no.runsafe.api.entity.IAgeable;
import no.runsafe.api.entity.ICreature;

public interface IVillager extends IAgeable, ICreature
{
	void setProfession(VillagerProfession profession);
	VillagerProfession getProfession();
}