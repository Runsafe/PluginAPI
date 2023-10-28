package no.runsafe.api.block;

import no.runsafe.api.minecraft.IInventoryHolder;

public interface IDispenser extends IInventoryHolder, IBlockState, IBlock
{
	boolean dispense();
}
