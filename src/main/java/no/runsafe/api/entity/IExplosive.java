package no.runsafe.api.entity;

public interface IExplosive extends IEntity
{
	void setYield(float yield);
	float getYield();
	void setIsIncendiary(boolean incendiary);
	boolean isIncendiary();
}
