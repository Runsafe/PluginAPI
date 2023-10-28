package no.runsafe.api.entity;

public interface ICreature extends ILivingEntity
{
	ILivingEntity getTarget();
	void setTarget(ILivingEntity target);
}
