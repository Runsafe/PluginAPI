package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.item.IMeta;

import java.util.List;

public interface EntityDeathEventArgs extends EntityEventArgs {
    List<IMeta> getDrops();

    void setDrops(Iterable<IMeta> items);

    int getDroppedXP();

    void setDroppedXP(int xp);
}
