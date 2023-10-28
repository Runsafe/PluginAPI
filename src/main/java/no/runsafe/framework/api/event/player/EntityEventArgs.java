package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.EventArgs;

public interface EntityEventArgs extends EventArgs {
    IEntity getEntity();
}
