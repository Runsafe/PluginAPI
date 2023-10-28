package no.runsafe.api.event.entity;

public interface EntityPortalEventArgs extends EntityTeleportEventArgs {
    void useTravelAgent(boolean useTravelAgent);

    boolean useTravelAgent();

    ITravelAgent getPortalTravelAgent();
}
