package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.InventoryType;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.item.IMeta;
import no.runsafe.framework.api.player.IPlayer;

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
