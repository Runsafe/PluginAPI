package no.runsafe.api.event.player;

import no.runsafe.api.event.IFakeableEvent;
import no.runsafe.api.player.IPlayer;

public interface CustomEventArgs extends IFakeableEvent {
    IPlayer getPlayer();
    String getEvent();
    Object getData();
}
