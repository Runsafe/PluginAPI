package no.runsafe.api.entity.monsters;

public interface IPigZombie extends IZombie
{
	int getAngerLevel();

	void setAngerLevel(int angerLevel);

	boolean isAngry();

	void setAngry(boolean angry);
}
