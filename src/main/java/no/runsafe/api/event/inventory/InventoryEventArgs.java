package no.runsafe.api.event.inventory;

import no.runsafe.api.event.EventArgs;
import no.runsafe.api.player.IPlayer;

import java.util.List;

public interface InventoryEventArgs extends EventArgs {
    IInventory getInventory();

    List<IPlayer> getViewers();
}
