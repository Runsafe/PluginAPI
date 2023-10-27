package no.runsafe.framework.api.command.argument;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import no.runsafe.framework.api.GlobalKernel;
import no.runsafe.framework.api.IServer;
import no.runsafe.framework.api.command.Command;
import no.runsafe.framework.api.command.ICommandExecutor;
import no.runsafe.framework.api.player.IAmbiguousPlayer;
import no.runsafe.framework.api.player.IPlayer;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

public class Player extends BasePlayerArgument
{
	public Player()
	{
		this("player");
	}

	public Player(String name)
	{
		super(name);
	}

	public Player onlineOnly()
	{
		onlineOnly = true;
		return this;
	}

	public Player defaultToExecutor()
	{
		expand = true;
		return this;
	}

	@Nullable
	@Override
	public String expand(ICommandExecutor context, @Nullable String value)
	{
		if (onlineOnly)
		{
			return context instanceof IPlayer
				? expandOnlineForPlayer((IPlayer) context, value)
				: expandOnlineForConsole(context, value);
		}
		return expandAny(context, value);
	}

	@Override
	public IPlayer getValue(IPlayer context, Map<String, String> params)
	{
		return onlineOnly ? getOnlineValue(context, params) : getAnyValue(context, params);
	}

	private IPlayer getAnyValue(IPlayer context, Map<String, String> params)
	{
		String param = params.get(name);
		if (param == null || param.isEmpty())
			return defaultValue;
		return factory.getPlayerExact(param);
	}

	private IPlayer getOnlineValue(IPlayer context, Map<String, String> params)
	{
		String param = params.get(name);
		if (param == null || param.isEmpty())
			return defaultValue;
		return GlobalKernel.Instance.getGlobalComponent(IServer.class).getPlayerExact(param);
	}

	private String expandAny(ICommandExecutor context, @Nullable String value)
	{
		if (value == null)
			return expand ? context.getName() : null;

		Matcher quoted = Command.QUOTED_ARGUMENT.matcher(value);
		if (quoted.matches())
			return quoted.group(1);

		List<String> matches = factory.find(value);
		if (matches.size() > 1)
		{
			context.sendColouredMessage(factory.getAmbiguousPlayerByName(matches).toString());
			if (!isRequired() && expand)
				return null;
		}
		if (matches.size() == 1)
			return matches.get(0);

		context.sendColouredMessage("Unable to locate any players matching '%s'!", value);
		return null;
	}

	private String expandOnlineForConsole(ICommandExecutor context, @Nullable String value)
	{
		if (value == null)
			return null;
		Matcher quoted = Command.QUOTED_ARGUMENT.matcher(value);
		if (quoted.matches())
		{
			IPlayer target = factory.getPlayerExact(quoted.group(1));
			if (target != null && target.isOnline())
				return target.getName();
			return null;
		}

		List<IPlayer> matches = factory.getOnlinePlayers(value);
		if (matches != null && matches.size() > 1)
		{
			context.sendColouredMessage(factory.getAmbiguousPlayer(matches).toString());
			if (!isRequired() && expand)
				return null;
		}
		if (matches != null && matches.size() == 1)
			return matches.get(0).getName();

		context.sendColouredMessage("Unable to locate any players matching '%s'!", value);
		return null;
	}

	@Nullable
	private String expandOnlineForPlayer(IPlayer context, String value)
	{
		if(value == null)
			return expand ? context.getName() : null;
		Matcher quoted = Command.QUOTED_ARGUMENT.matcher(value);
		if (quoted.matches())
		{
			IPlayer target = factory.getPlayerExact(quoted.group(1));
			if (target == null || context.shouldNotSee(target))
				return null;
			return quoted.group(1);
		}
		List<String> matches = factory.getOnlinePlayers(context, value);
		if (matches != null && matches.size() > 1)
		{
			context.sendColouredMessage(factory.getAmbiguousPlayerByName(matches).toString());
			if (!isRequired() && expand)
				return null;
		}
		if (matches != null && matches.size() == 1)
			return matches.get(0);

		context.sendColouredMessage("Unable to locate any players matching '%s'!", value);
		return null;
	}

	private boolean onlineOnly;
}