package no.runsafe.framework.api.event.entity;

public interface EntityPortalEventArgs extends EntityTeleportEventArgs {
    void useTravelAgent(boolean useTravelAgent);

    boolean useTravelAgent();

    ITravelAgent getPortalTravelAgent();
}
