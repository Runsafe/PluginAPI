package no.runsafe.api.block;

import no.runsafe.api.minecraft.IInventoryHolder;

public interface IDropper extends IInventoryHolder, IBlockState, IBlock
{
	void drop();
}
