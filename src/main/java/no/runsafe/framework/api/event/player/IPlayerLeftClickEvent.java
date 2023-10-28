package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPlayerLeftClickEvent extends IRunsafeEvent
{
	void OnPlayerLeftClick(PlayerClickEventArgs event);
}
