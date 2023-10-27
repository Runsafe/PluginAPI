package no.runsafe.framework.api.item;

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

    boolean containsEnchantment(IEnchantment ench);

    int getEnchantmentLevel(IEnchantment ench);

    Map<IEnchantment, Integer> getEnchantments();

    void addEnchantment(IEnchantment ench, int level);

    void addUnsafeEnchantment(IEnchantment ench, int level);

    int removeEnchantment(IEnchantment ench);

    boolean hasItemMeta();
}
