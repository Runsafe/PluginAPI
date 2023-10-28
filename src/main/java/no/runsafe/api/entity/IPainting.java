package no.runsafe.api.entity;

public interface IPainting extends IHanging
{
    void NextArt();

    void PrevArt();

    String getArt();

    void setArt(String name);

    void setArt(int id);
}
