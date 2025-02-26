package no.runsafe.api;

import no.runsafe.api.minecraft.IInventoryHolder;
import no.runsafe.api.minecraft.IMapView;
import no.runsafe.api.player.IPlayer;
import no.runsafe.api.player.IPlayerInventory;
import no.runsafe.api.server.*;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IServer extends IPlayerProvider, IPlayerManager, IBroadcast, IWhitelistManager, IWorldManager
{
	boolean someoneHasPermission(String permission);

	List<IPlayer> getPlayersWithPermission(String permission);

	@Nullable
	<T extends IPlugin> T getPlugin(String pluginName);

	void clearRecipes();

	boolean getAllowFlight();

	String getBukkitVersion();

	Map<String, String[]> getCommandAliases();

	long getConnectionThrottle();

	boolean getGenerateStructures();

	String getIp();

	int getMaxPlayers();

	String getName();

	boolean getOnlineMode();

	List<IPlayer> getOperators();

	int getPort();

	String getServerId();

	String getServerName();

	int getSpawnRadius();

	int getTicksPerAnimalSpawns();

	int getTicksPerMonsterSpawns();

	String getUpdateFolder();

	int getViewDistance();

	void reload();

	void resetRecipes();

	void savePlayers();

	void setSpawnRadius(int radius);

	void shutdown();

	IPlayerInventory createInventory(IInventoryHolder holder, int size, String name);

	IPlayerInventory createInventory(IInventoryHolder holder, int size);

	@Nullable
	IPlayerInventory createInventory(IInventoryHolder holder, InventoryType type);

	void stop();

	boolean isHardcore();

	int getWaterAnimalSpawnLimit();

	int getAmbientSpawnLimit();

	int getMonsterSpawnLimit();

	int getAnimalSpawnLimit();

	boolean isPrimaryThread();

	String getMessageOfTheDay();

	String getShutdownMessage();

	Set<String> getListeningPluginChannels();

	IMapView getMap(short id);
}
