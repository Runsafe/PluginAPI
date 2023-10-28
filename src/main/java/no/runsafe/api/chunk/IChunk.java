package no.runsafe.api.chunk;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;
import no.runsafe.api.entity.IEntity;
import no.runsafe.api.block.IBlock;
import no.runsafe.api.block.IBlockState;

import javax.annotation.Nonnull;
import java.util.List;

public interface IChunk
{
	int getX();
	int getZ();
	@Nonnull
    IWorld getWorld();
	@Nonnull
	IBlock getBlock(int i, int i1, int i2);
	@Nonnull
	List<IEntity> getEntities();
	@Nonnull
	List<IBlockState> getTileEntities();
	boolean isUnloaded();
	boolean load(boolean generate);
	boolean load();
	boolean unload(boolean b, boolean b1);
	boolean unload(boolean b);
	boolean unload();
	boolean locationIsInChunk(ILocation location);
}
