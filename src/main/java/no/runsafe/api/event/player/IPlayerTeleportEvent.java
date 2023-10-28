package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerTeleportEvent extends IRunsafeEvent
{
	void OnPlayerTeleport(PlayerTeleportEventArgs event);
}

