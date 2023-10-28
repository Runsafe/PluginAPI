package no.runsafe.api.event.player;

import no.runsafe.api.event.entity.EntityDamageEventArgs;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPlayerDamageEvent extends IRunsafeEvent
{
	void OnPlayerDamage(IPlayer player, EntityDamageEventArgs event);
}
