package no.runsafe.framework.api.block;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.IWorld;
import no.runsafe.framework.api.item.IItem;
import no.runsafe.framework.api.metadata.IMetadata;

@SuppressWarnings("InstanceMethodNamingConvention")
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
