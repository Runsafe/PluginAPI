package no.runsafe.api;

import no.runsafe.api.block.IBlock;
import no.runsafe.api.entity.IEntity;
import no.runsafe.api.item.IItem;
import no.runsafe.api.item.IMeta;
import no.runsafe.api.metadata.IMetadata;
import no.runsafe.api.minecraft.RunsafeEntityType;
import no.runsafe.api.player.IPlayer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public interface IWorld extends IMetadata
{
	@Nullable
	IEntity getEntityById(int id);

	boolean isUniverse(String name);

	@Nonnull
	IUniverse getUniverse();

	boolean isConnected(IWorld world);

	@Nullable
	ILocation getLocation(Double x, Double y, Double z);

	@Nullable
	ILocation getLocation(Double x, Double y, Double z, Float yaw, Float pitch);

	boolean isWorld(IWorld world);

	@Nonnull
	String getName();

	@Nonnull
	IBlock getBlockAt(ILocation location);

	@Nonnull
	IBlock getBlockAt(int x, int y, int z);

	@Deprecated
	int getBlockTypeIdAt(ILocation location);

	@Deprecated
	int getBlockTypeIdAt(int x, int y, int z);

	@Nonnull
	IItem dropItem(ILocation location, IMeta itemStack);

	void strikeLightning(ILocation location);

	void createExplosion(ILocation location, float power, boolean setFire);

	void createExplosion(ILocation location, float power, boolean setFire, boolean breakBlocks);

	int getMaxHeight();

	@Nonnull
	IEntity spawnCreature(ILocation location, String type);

	@Nonnull
	@Deprecated
	IEntity spawnCreature(ILocation location, int id);

	IEntity spawnFallingBlock(ILocation location, IItem type);

	IEntity spawn(ILocation location, RunsafeEntityType type);

	void strikeLightningEffect(ILocation location);

	@Nonnull
	List<IPlayer> getPlayers();

	@Nonnull
	List<IEntity> getEntities();

	/**
	 * Gets a list of game rule names.
	 * @return Names of various game rules.
	 */
	String[] getGameRules();

	/**
	 * Gets the value of a game rule.
	 * @param gameRuleName Name of the game rule.
	 * @return Game rule's value represented as a string.
	 */
	String getGameRuleValue(String gameRuleName);

	/**
	 * Sets a game rule's value.
	 * @param gameRuleName Name of game rule.
	 * @param newGameRuleValue Game rule value to set.
	 * @return True if it could be set, false if it could not be set.
	 */
	boolean setGameRuleValue(String gameRuleName, String newGameRuleValue);

	/**
	 * Checks if a game rule name is an actual game rule.
	 * @param gameRuleName Game rule name to check.
	 * @return True if it's real, false if it's not real.
	 */
	boolean isGameRule(String gameRuleName);

	boolean isNormal();

	boolean isNether();

	boolean isTheEnd();

	void setTime(long time);

	ILocation getSpawnLocation();

	int getHighestBlockYAt(int x, int z);

	int getHighestBlockYAt(ILocation location);

	IBlock getHighestBlockAt(int x, int z);

	IBlock getHighestBlockAt(ILocation location);
}
