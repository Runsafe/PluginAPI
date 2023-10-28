package no.runsafe.api.block;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;
import no.runsafe.api.item.IItem;
import no.runsafe.api.metadata.IMetadata;

public interface IBlock extends IMetadata
{
	void set(IItem type);
	IWorld getWorld();
	ILocation getLocation();
	IItem getMaterial();
	void setMaterial(IItem material);
	void breakNaturally();
	boolean is(IItem type);
	boolean isAny(IItem... type);
	boolean hasInterface();
	boolean isInteractBlock();
	boolean canPassThrough();
	boolean isHazardous();
	boolean isAir();
	boolean isWater();
	boolean isLava();
	boolean isAbleToFall();
	byte getData();
	void setData(byte data);
	int getRedstonePower();
}
