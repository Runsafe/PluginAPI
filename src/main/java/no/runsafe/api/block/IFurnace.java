package no.runsafe.api.block;

import no.runsafe.api.minecraft.IInventoryHolder;

public interface IFurnace extends IBlockState, IInventoryHolder, IBlock
{
	short getBurnTime();
	void setBurnTime(short time);
	short getCookTime();
	void setCookTime(short time);
}
