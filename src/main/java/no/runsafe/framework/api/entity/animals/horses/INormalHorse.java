package no.runsafe.framework.api.entity.animals.horses;

public interface INormalHorse extends IHorse
{
	Horse.Color getColour();

	void setColour(HorseColour colour);

	void setRandomColour();

	Horse.Style getStyle();

	void setStyle(HorseStyle style);

	void setRandomStyle();
}
