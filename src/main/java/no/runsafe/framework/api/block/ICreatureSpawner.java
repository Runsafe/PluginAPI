package no.runsafe.framework.api.block;

import no.runsafe.framework.api.entity.ILivingEntity;
import no.runsafe.framework.api.minecraft.RunsafeEntityType;

public interface ICreatureSpawner extends IBlockState, IBlock
{
	void setCreature(ILivingEntity type);
	void setCreature(RunsafeEntityType type);
	RunsafeEntityType getCreature();
	int getDelay();
	void setDelay(int delay);
}
