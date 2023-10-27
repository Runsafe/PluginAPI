package no.runsafe.framework.api.event.vehicle;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IVehicleExit extends IRunsafeEvent
{
	void OnVehicleExit(VehicleExitEventArgs event);
}
