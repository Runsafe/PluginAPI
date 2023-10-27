package no.runsafe.framework.api.block;

import no.runsafe.framework.api.item.IItem;

public interface IJukebox extends IBlockState, IBlock
{
	IItem getPlaying();
	void setPlaying(IItem material);
	boolean isPlaying();
	boolean eject();
}
