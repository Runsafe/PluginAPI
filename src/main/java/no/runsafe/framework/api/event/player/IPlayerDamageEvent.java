package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.event.entity.EntityDamageEventArgs;
import no.runsafe.framework.api.player.IPlayer;

public interface IPlayerDamageEvent extends IRunsafeEvent
{
	void OnPlayerDamage(IPlayer player, EntityDamageEventArgs event);
}
