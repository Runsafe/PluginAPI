package no.runsafe.api.event.enchantment;

import no.runsafe.api.event.inventory.InventoryEventArgs;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IMeta;
import no.runsafe.api.player.IPlayer;

public interface PrepareItemEnchantEventArgs extends InventoryEventArgs, CancellableEvent {
    IPlayer getEnchanter();

    IBlock getEnchantBlock();

    IMeta getItem();

    int[] getExpLevelCostsOffered();

    int getEnchantmentBonus();
}
