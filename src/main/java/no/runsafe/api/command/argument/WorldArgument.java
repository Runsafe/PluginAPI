package no.runsafe.api.command.argument;

import com.google.common.collect.Lists;
import no.runsafe.api.GlobalKernel;
import no.runsafe.api.IUniverseManager;
import no.runsafe.api.IWorld;
import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.player.IPlayer;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class WorldArgument extends CommandArgumentSpecification<IWorld> implements ListOf.Compatible<IWorld>
{
	public WorldArgument()
	{
		this("world");
	}

	public WorldArgument(String name)
	{
		super(name);
		multiverse = GlobalKernel.Instance.getGlobalComponent(IUniverseManager.class);
	}

	@Override
	public boolean isWhitespaceInclusive()
	{
		return false;
	}

	@Override
	public List<String> getAlternatives(IPlayer executor, String partial)
	{
		return Lists.transform(
			multiverse.getAllWorlds(),
			world -> {
				assert world != null;
				return world.getName();
			}
		);
	}

	@Nullable
	@Override
	public String expand(ICommandExecutor context, @Nullable String value)
	{
		if (value == null)
			return null;

		String filter = value.toLowerCase();
		String partialMatch = null;

		for (IWorld world : multiverse.getAllWorlds())
		{
			String worldName = world.getName();

			if (worldName.equalsIgnoreCase(filter))
				return worldName;

			if (world.getName().toLowerCase().startsWith(filter))
				partialMatch = world.getName();
		}

		return partialMatch;
	}

	@Override
	public IWorld getValue(IPlayer context, Map<String, String> params)
	{
		String param = params.get(name);
		if (param != null && !param.isEmpty())
			return multiverse.getWorld(params.get(name));
		return defaultValue;
	}

	private final IUniverseManager multiverse;
}
