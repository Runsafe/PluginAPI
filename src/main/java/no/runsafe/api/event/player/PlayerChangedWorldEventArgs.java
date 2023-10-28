package no.runsafe.api.event.player;

import no.runsafe.api.IWorld;

public interface PlayerChangedWorldEventArgs extends PlayerEventArgs {
    IWorld getSourceWorld();
}
