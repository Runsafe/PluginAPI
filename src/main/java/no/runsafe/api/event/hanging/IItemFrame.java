package no.runsafe.api.event.hanging;

import no.runsafe.api.entity.IHanging;
import no.runsafe.api.item.IMeta;

public interface IItemFrame extends IHanging {
    IMeta getItem();

    void setItem(IMeta item);
}
