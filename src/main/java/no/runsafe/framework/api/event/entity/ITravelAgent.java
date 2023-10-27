package no.runsafe.framework.api.event.entity;

import no.runsafe.framework.api.ILocation;

public interface ITravelAgent {
    boolean createPortal(ILocation location);

    ILocation findOrCreate(ILocation location);

    ILocation findPortal(ILocation location);

    boolean getCanCreatePortal();

    int getSearchRadius();

    void setCanCreatePortal(boolean create);

    ITravelAgent setCreationRadius(int radius);

    ITravelAgent setSearchRadius(int radius);
}
