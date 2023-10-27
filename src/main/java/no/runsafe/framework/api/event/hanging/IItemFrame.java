package no.runsafe.framework.api.event.hanging;

import no.runsafe.framework.api.entity.IHanging;
import no.runsafe.framework.api.item.IMeta;

public interface IItemFrame extends IHanging {
    IMeta getItem();

    void setItem(IMeta item);
}
