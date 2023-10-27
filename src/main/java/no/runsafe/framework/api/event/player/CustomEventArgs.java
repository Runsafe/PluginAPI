package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface CustomEventArgs extends IFakeableEvent {
    IPlayer getPlayer();
    String getEvent();
    Object getData();
}
