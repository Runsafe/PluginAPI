package no.runsafe.api.event.player;

import no.runsafe.api.event.IRunsafeEvent;


public interface IPlayerFishEvent extends IRunsafeEvent
{
	void OnPlayerFish(PlayerFishEventArgs event);
}
