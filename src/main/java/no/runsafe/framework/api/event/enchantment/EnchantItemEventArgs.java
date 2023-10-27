package no.runsafe.framework.api.event.enchantment;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.inventory.InventoryEventArgs;
import no.runsafe.framework.api.item.IEnchantment;
import no.runsafe.framework.api.item.IMeta;
import no.runsafe.framework.api.player.IPlayer;

import java.util.Map;

public interface EnchantItemEventArgs extends InventoryEventArgs, CancellableEvent {
    IPlayer getEnchanter();

    IBlock getEnchantBlock();

    IMeta getItem();

    int getExpLevelCost();

    void setExpLevelCost(int level);

    Map<IEnchantment, Integer> getEnchantsToAdd();

    int whichButton();
}
