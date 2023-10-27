package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.EventArgs;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface EntityEventArgs extends EventArgs {
    IEntity getEntity();
}
