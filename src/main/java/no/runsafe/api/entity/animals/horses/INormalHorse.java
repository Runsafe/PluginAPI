package no.runsafe.api.entity.animals.horses;

public interface INormalHorse extends IHorse
{
	HorseColour getColour();

	void setColour(HorseColour colour);

	void setRandomColour();

	HorseStyle getStyle();

	void setStyle(HorseStyle style);

	void setRandomStyle();
}

