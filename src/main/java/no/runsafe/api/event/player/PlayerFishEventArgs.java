package no.runsafe.api.event.player;

import no.runsafe.api.entity.IEntity;
import no.runsafe.api.event.CancellableEvent;

public interface PlayerFishEventArgs extends PlayerEventArgs, CancellableEvent {
    IEntity getCaught();

    Object getFish();

    int getExpToDrop();

    void setExpToDrop(int exp);

    State getState();

    enum State {
        FISHING,
        CAUGHT_FISH,
        CAUGHT_ENTITY,
        IN_GROUND,
        FAILED_ATTEMPT
    }
}
