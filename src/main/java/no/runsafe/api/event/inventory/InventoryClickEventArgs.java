package no.runsafe.api.event.inventory;

import no.runsafe.api.InventoryType;
import no.runsafe.api.event.CancellableEvent;
import no.runsafe.api.item.IMeta;
import no.runsafe.api.player.IPlayer;

public interface InventoryClickEventArgs extends CancellableEvent {
    InventoryType.SlotType getSlotType();

    IMeta getCursor();

    IPlayer getWhoClicked();

    IMeta getCurrentItem();

    boolean isRightClick();

    boolean isLeftClick();

    boolean isShiftClick();

    void setCurrentItem(IMeta what);

    int getSlot();

    int getRawSlot();
}
