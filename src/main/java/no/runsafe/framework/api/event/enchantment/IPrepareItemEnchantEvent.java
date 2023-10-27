package no.runsafe.framework.api.event.enchantment;

import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.inventory.InventoryEventArgs;
import no.runsafe.framework.api.item.IMeta;
import no.runsafe.framework.api.player.IPlayer;

public interface IPrepareItemEnchantEvent extends IRunsafeEvent
{
	void OnPrepareItemEnchantEvent(PrepareItemEnchantEventArgs event);
}

