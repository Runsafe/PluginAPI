package no.runsafe.framework.api.event.vehicle;

import no.runsafe.framework.api.entity.ILivingEntity;
import no.runsafe.framework.api.event.CancellableEvent;

public interface VehicleExitEventArgs extends CancellableEvent {
    ILivingEntity getExiting();
}
