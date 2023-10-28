package no.runsafe.api.server;

import no.runsafe.api.IServer;

import java.io.File;
import java.io.InputStream;
import java.util.logging.Logger;

public interface IPlugin
{
    File getDataFolder();

    InputStream getResource(String var1);

    void saveConfig();

    void saveDefaultConfig();

    void saveResource(String var1, boolean var2);

    void reloadConfig();

    IServer getServer();

    boolean isEnabled();

    void onDisable();

    void onLoad();

    void onEnable();

    boolean isNaggable();

    void setNaggable(boolean var1);

    Logger getLogger();

    String getName();
}
