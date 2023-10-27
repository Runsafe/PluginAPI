package no.runsafe.framework.api.event;

import no.runsafe.framework.api.minecraft.IMapView;

public interface IMapInitializeEvent extends IRunsafeEvent
{
	void OnMapInitialize(IMapView mapView);
}
