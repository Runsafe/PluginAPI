package no.runsafe.api.event.inventory;

import no.runsafe.api.player.IPlayer;

public interface InventoryCloseEventArgs extends InventoryEventArgs {
    IPlayer getPlayer();
}
