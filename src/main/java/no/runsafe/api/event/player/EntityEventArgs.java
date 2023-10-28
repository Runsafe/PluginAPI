package no.runsafe.api.event.player;

import no.runsafe.api.entity.IEntity;
import no.runsafe.api.event.EventArgs;

public interface EntityEventArgs extends EventArgs {
    IEntity getEntity();
}
