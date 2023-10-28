package no.runsafe.api.item;

import no.runsafe.api.minecraft.IEnchant;
import no.runsafe.api.minecraft.IEnchantable;

public interface IEnchantment {
    int getId();

    String getName();

    int getMaxLevel();

    int getStartLevel();

    boolean compatibleWith(IEnchant enchantment);

    boolean canEnchantItem(IEnchantable target);
}
