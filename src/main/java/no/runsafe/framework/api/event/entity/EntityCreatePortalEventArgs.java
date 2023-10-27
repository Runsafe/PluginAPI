package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.player.EntityEventArgs;

public interface EntityCreatePortalEventArgs extends EntityEventArgs, CancellableEvent {
    boolean isNetherPortal();
    boolean isEnderPortal();
    boolean isCustomPortal();
}
