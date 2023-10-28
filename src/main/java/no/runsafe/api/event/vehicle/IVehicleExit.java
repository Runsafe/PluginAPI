package no.runsafe.api.event.vehicle;

import no.runsafe.api.event.IRunsafeEvent;

public interface IVehicleExit extends IRunsafeEvent
{
	void OnVehicleExit(VehicleExitEventArgs event);
}
