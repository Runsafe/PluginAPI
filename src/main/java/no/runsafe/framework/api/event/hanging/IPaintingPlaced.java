package no.runsafe.framework.api.event.hanging;

import no.runsafe.framework.api.entity.IPainting;
import no.runsafe.framework.api.event.IRunsafeEvent;
import no.runsafe.framework.api.player.IPlayer;

public interface IPaintingPlaced extends IRunsafeEvent
{
	boolean OnPaintingPlaced(IPlayer player, IPainting painting);
}
