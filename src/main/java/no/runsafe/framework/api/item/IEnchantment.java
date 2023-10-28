package no.runsafe.framework.api.item;

import no.runsafe.framework.api.minecraft.IEnchant;
import no.runsafe.framework.api.minecraft.IEnchantable;

public interface IEnchantment {
    int getId();

    String getName();

    int getMaxLevel();

    int getStartLevel();

    boolean compatibleWith(IEnchant enchantment);

    boolean canEnchantItem(IEnchantable target);
}
