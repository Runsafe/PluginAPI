package no.runsafe.api.hook;

import com.google.common.collect.ImmutableList;
import no.runsafe.api.player.IFakePlayer;
import no.runsafe.api.player.IPlayer;

import javax.annotation.Nullable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface IPlayerExtensions
{
	@Nullable
	String seen(IPlayer player, IPlayer checker);
	String decorate(IPlayer player);
	boolean isNew(IPlayer player);
	Map<String, String> data(IPlayer player);
	@Nullable
	ZonedDateTime logout(IPlayer player);
	@Nullable
	String banReason(IPlayer player);
	boolean shouldNotSee(IPlayer player, IPlayer target);
	boolean isVanished(IPlayer player);
	boolean isPvPFlagged(IPlayer player);
	ImmutableList<String> getGroups(IPlayer player);
	boolean setGroup(IPlayer player, String group);
	boolean canBuildNow(IPlayer player);
	boolean hasPermission(IFakePlayer player, ImmutableList<String> memberOf, String permission);
	List<String> getGroups();
	List<String> find(String playerName);
	@Nullable
	UUID getUniqueId(String playerName);
	String getPlayerName(UUID playerId);
	void addPermission(IPlayer player, String permission, String world);
	void addPermission(IPlayer player, String permission);
	void removePermission(IPlayer player, String permission, String world);
	void removePermission(IPlayer player, String permission);
}
