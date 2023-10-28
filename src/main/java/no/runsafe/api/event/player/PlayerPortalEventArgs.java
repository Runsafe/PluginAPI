package no.runsafe.api.event.player;

import no.runsafe.api.event.entity.ITravelAgent;

public interface PlayerPortalEventArgs extends PlayerTeleportEventArgs {
    void useTravelAgent(boolean useTravelAgent);

    boolean useTravelAgent();

    ITravelAgent getPortalTravelAgent();

    void setPortalTravelAgent(ITravelAgent travelAgent);
}
