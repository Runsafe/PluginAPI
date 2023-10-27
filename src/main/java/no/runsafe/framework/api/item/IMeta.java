package no.runsafe.framework.api.item;

import javax.annotation.Nullable;
import java.util.List;

public interface IMeta {
    boolean hasEnchants();

    boolean hasEnchant(IEnchantment ench);

    int getEnchantLevel(IEnchantment ench);

    boolean addEnchant(IEnchantment ench, int level, boolean anyLevel);

    boolean removeEnchant(IEnchantment ench);

    boolean hasDisplayName();

    @Nullable
    String getDisplayName();

    IMeta setDisplayName(String name);

    boolean hasLore();

    @Nullable
    List<String> getLore();

    IMeta addLore(String lore);

    IMeta setLore(List<String> lore);

    IMeta clearLore();
}
