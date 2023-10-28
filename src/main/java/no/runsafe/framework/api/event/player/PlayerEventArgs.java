package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.EventArgs;
import no.runsafe.framework.api.player.IPlayer;

public interface PlayerEventArgs extends EventArgs
{
    IPlayer getPlayer();
}
