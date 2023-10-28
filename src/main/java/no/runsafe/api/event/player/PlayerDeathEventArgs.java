package no.runsafe.api.event.player;

import no.runsafe.api.event.IFakeableEvent;

public interface PlayerDeathEventArgs extends PlayerEventArgs, EntityDeathEventArgs, IFakeableEvent {
    void setDeathMessage(String deathMessage);

    String getDeathMessage();

    int getLevelAmount();

    void setNewLevelAmount(int level);
}
