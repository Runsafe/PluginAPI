package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;

public interface PlayerDeathEventArgs extends PlayerEventArgs, EntityDeathEventArgs, IFakeableEvent {
    void setDeathMessage(String deathMessage);

    String getDeathMessage();

    int getLevelAmount();

    void setNewLevelAmount(int level);
}
