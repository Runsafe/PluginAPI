package no.runsafe.api.event.entity;

import no.runsafe.api.event.player.EntityEventArgs;
import no.runsafe.api.event.CancellableEvent;

public interface EntityCreatePortalEventArgs extends EntityEventArgs, CancellableEvent {
    boolean isNetherPortal();
    boolean isEnderPortal();
    boolean isCustomPortal();
}
