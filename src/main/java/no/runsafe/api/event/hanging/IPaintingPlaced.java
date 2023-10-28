package no.runsafe.api.event.hanging;

import no.runsafe.api.entity.IPainting;
import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IPaintingPlaced extends IRunsafeEvent
{
	boolean OnPaintingPlaced(IPlayer player, IPainting painting);
}
