package no.runsafe.api.event;

import no.runsafe.api.minecraft.IMapView;

public interface IMapInitializeEvent extends IRunsafeEvent
{
	void OnMapInitialize(IMapView mapView);
}
