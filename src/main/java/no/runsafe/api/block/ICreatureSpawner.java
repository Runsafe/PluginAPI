package no.runsafe.api.block;

import no.runsafe.api.entity.ILivingEntity;
import no.runsafe.api.minecraft.RunsafeEntityType;

public interface ICreatureSpawner extends IBlockState, IBlock
{
	void setCreature(ILivingEntity type);
	void setCreature(RunsafeEntityType type);
	RunsafeEntityType getCreature();
	int getDelay();
	void setDelay(int delay);
}
