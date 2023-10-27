package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.player.IPlayer;

public interface InventoryCloseEventArgs extends InventoryEventArgs {
    IPlayer getPlayer();
}
