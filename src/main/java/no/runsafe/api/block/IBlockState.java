package no.runsafe.api.block;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;
import no.runsafe.api.chunk.IChunk;
import no.runsafe.api.item.IItem;
import no.runsafe.api.metadata.IMetadata;
import no.runsafe.api.item.IMaterialData;

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
