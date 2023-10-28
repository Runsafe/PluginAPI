package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPlayerLeftClickEvent extends IRunsafeEvent
{
	void OnPlayerLeftClick(PlayerClickEventArgs event);
}
