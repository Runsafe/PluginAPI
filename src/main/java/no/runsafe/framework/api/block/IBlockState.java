package no.runsafe.framework.api.block;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.IWorld;
import no.runsafe.framework.api.chunk.IChunk;
import no.runsafe.framework.api.item.IItem;
import no.runsafe.framework.api.item.IMaterialData;
import no.runsafe.framework.api.metadata.IMetadata;

public interface IBlockState extends IMetadata
{
	IChunk getChunk();
	IMaterialData getMaterialData();
	byte getLightLevel();
	ILocation getLocation();
	IItem getMaterial();
	void setMaterial(IItem material);
	IWorld getWorld();
	void setMaterialData(IMaterialData materialData);
	void update(boolean forceUpdate);
}
