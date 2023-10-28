package no.runsafe.api.block;

import no.runsafe.api.ILocation;
import no.runsafe.api.minecraft.IInventoryHolder;

public interface IDoubleChest extends IInventoryHolder
{
	IInventoryHolder getLeftSide();
	ILocation getLocation();
	IInventoryHolder getRightSide();
}
