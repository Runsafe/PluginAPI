package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerCustomEvent
{
	void OnPlayerCustomEvent(CustomEventArgs event);
}
