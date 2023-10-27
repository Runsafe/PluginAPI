package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;


public interface IPlayerFishEvent extends IRunsafeEvent
{
	void OnPlayerFish(PlayerFishEventArgs event);
}
