package no.runsafe.api.minecraft;

import no.runsafe.api.item.IMeta;

public interface IEnchantable
{
	boolean enchanted();

	boolean enchanted(IEnchant enchant);

	IEnchantable enchant(IEnchant enchant);

	IEnchantable disenchant();

	IEnchantable disenchant(IEnchant enchant);

	IMeta getItem();

	IEnchantable enchant(Iterable<IEnchant> enchants);
}

