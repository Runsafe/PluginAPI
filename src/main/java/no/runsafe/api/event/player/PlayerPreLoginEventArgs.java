package no.runsafe.api.event.player;

import java.net.InetAddress;
import java.util.UUID;

public interface PlayerPreLoginEventArgs extends PlayerEventArgs {
    UUID getUniqueId();

    void allow();

    void serverFull(String message);

    void playerBanned(String message);

    void playerNotWhitelisted(String message);

    void disallow(String message);

    InetAddress getAddress();

    boolean getHasBeenKicked();

    String getKickMessage();

    void setKickMessage(String message);
}
