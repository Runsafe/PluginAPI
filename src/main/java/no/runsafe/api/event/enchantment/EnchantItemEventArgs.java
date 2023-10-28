package no.runsafe.api.event.enchantment;

import no.runsafe.api.event.inventory.InventoryEventArgs;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IEnchantment;
import no.runsafe.api.item.IMeta;
import no.runsafe.api.player.IPlayer;

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
