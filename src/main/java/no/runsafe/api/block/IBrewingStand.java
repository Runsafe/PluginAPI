package no.runsafe.api.block;

import no.runsafe.api.event.inventory.IInventory;

public interface IBrewingStand extends IBlockState, IBlock
{
	int getBrewingTime();
	void setBrewingTime(int i);
	IInventory getInventory();
}
