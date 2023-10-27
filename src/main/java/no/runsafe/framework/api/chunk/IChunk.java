package no.runsafe.framework.api.chunk;

import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.IWorld;
import no.runsafe.framework.api.block.IBlock;
import no.runsafe.framework.api.block.IBlockState;
import no.runsafe.framework.api.entity.IEntity;

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
