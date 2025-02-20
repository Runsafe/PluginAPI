package no.runsafe.api.database;

import no.runsafe.api.ILocation;
import no.runsafe.api.IWorld;
import no.runsafe.api.player.IPlayer;

import javax.annotation.Nonnull;
import java.time.ZonedDateTime;
import java.util.List;

public interface IQueryExecutor
{
	@Nonnull
	ISet query(String query, Object... params);
	@Nonnull
	IRow queryRow(String query, Object... params);
	@Nonnull
	List<String> queryStrings(String query, Object... params);
	@Nonnull
	List<Integer> queryIntegers(String query, Object... params);
	@Nonnull
	List<Long> queryLongs(String query, Object... params);
	@Nonnull
	List<Double> queryDoubles(String query, Object... params);
	@Nonnull
	List<Float> queryFloats(String query, Object... params);
	@Nonnull
	List<ZonedDateTime> queryDateTimes(String query, Object... params);
	@Nonnull
	List<IPlayer> queryPlayers(String query, Object... params);
	@Nonnull
	List<IWorld> queryWorlds(String query, Object... params);
	@Nonnull
	List<ILocation> queryLocations(String query, Object... params);
	boolean execute(String query, Object... params);
	int update(String query, Object... params);
	String queryString(String query, Object... params);
	Integer queryInteger(String query, Object... params);
	Long queryLong(String query, Object... params);
	Double queryDouble(String query, Object... params);
	Float queryFloat(String query, Object... params);
	ZonedDateTime queryDateTime(String query, Object... params);
	IPlayer queryPlayer(String query, Object... params);
	IWorld queryWorld(String query, Object... params);
	ILocation queryLocation(String query, Object... params);
	List<IValue> queryColumn(String query, Object... params);
	IValue queryValue(String query, Object... params);
}
