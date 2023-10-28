package no.runsafe.api.player;

import no.runsafe.api.ILocation;
import no.runsafe.api.block.IBlock;

public interface IPlayerNotification
{
	void sendColouredMessage(String format, Object... params);

	void sendTitle(String title, String subtitle);

	void resetTitle();

	void sendBlockChange(IBlock block, byte data);

	void sendBlockChange(ILocation location, int itemId, byte data);
}
