package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.IWorld;

public interface PlayerChangedWorldEventArgs extends PlayerEventArgs {
    IWorld getSourceWorld();
}
