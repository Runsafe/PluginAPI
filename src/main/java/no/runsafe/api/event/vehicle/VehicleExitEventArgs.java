package no.runsafe.api.event.vehicle;

import no.runsafe.api.entity.ILivingEntity;
import no.runsafe.api.event.CancellableEvent;

public interface VehicleExitEventArgs extends CancellableEvent {
    ILivingEntity getExiting();
}
