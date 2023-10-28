package no.runsafe.api.item;

import java.util.Map;

public interface IItemStack {
    @Deprecated
    int getItemId();

    @Deprecated
    void setItemId(int type);

    short getDurability();

    int getAmount();

    void setAmount(int amount);

    void remove(int amount);

    IMaterialData getData();

    void setData(IMaterialData data);

    void setDurability(short durability);

    int getMaxStackSize();

    boolean containsEnchantment(IEnchantment enchant);

    int getEnchantmentLevel(IEnchantment enchant);

    Map<IEnchantment, Integer> getEnchantments();

    void addEnchantment(IEnchantment enchant, int level);

    void addUnsafeEnchantment(IEnchantment enchant, int level);

    int removeEnchantment(IEnchantment enchant);

    boolean hasItemMeta();
}
