package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;

import java.net.InetAddress;

public interface PlayerLoginEventArgs extends PlayerEventArgs, IFakeableEvent {
    void allow();

    void serverFull(String message);

    void playerBanned(String message);

    void playerNotWhitelisted(String message);

    void disallow(String message);

    InetAddress getAddress();

    String getHostname();

    boolean getHasBeenKicked();

    String getKickMessage();

    void setKickMessage(String message);
}
