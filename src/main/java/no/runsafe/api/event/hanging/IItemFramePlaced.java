package no.runsafe.api.event.hanging;

import no.runsafe.api.event.IRunsafeEvent;
import no.runsafe.api.player.IPlayer;

public interface IItemFramePlaced extends IRunsafeEvent
{
	boolean OnItemFramePlaced(IPlayer player, IItemFrame itemFrame);
}

