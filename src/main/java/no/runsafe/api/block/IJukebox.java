package no.runsafe.api.block;

import no.runsafe.api.item.IItem;

public interface IJukebox extends IBlockState, IBlock
{
	IItem getPlaying();
	void setPlaying(IItem material);
	boolean isPlaying();
	boolean eject();
}
