package no.runsafe.framework.api.block;

import no.runsafe.framework.api.event.inventory.IInventory;

public interface IBrewingStand extends IBlockState, IBlock
{
	int getBrewingTime();
	void setBrewingTime(int i);
	IInventory getInventory();
}
