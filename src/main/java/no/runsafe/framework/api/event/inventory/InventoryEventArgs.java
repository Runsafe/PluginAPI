package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.EventArgs;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.player.IPlayer;

import java.util.List;

public interface InventoryEventArgs extends EventArgs {
    IInventory getInventory();

    List<IPlayer> getViewers();
}
