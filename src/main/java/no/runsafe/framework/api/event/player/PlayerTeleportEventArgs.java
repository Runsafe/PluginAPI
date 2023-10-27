package no.runsafe.framework.api.event.player;

public interface PlayerTeleportEventArgs extends PlayerMoveEventArgs {
    boolean isByEnderPearl();

    boolean isByCommand();

    boolean isByPlugin();

    boolean isByNetherPortal();

    boolean isByEndPortal();

    boolean isByUnknown();
}
