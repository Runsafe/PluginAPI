package no.runsafe.api.event.player;

import no.runsafe.api.event.EventArgs;
import no.runsafe.api.player.IPlayer;

public interface PlayerEventArgs extends EventArgs
{
    IPlayer getPlayer();
}
