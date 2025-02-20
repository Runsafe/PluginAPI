package no.runsafe.api.command.argument;

import com.google.common.collect.Lists;
import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.player.IPlayer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ListOf<T> implements IArgument, IValueExpander, ITabComplete, IValueProvider<List<T>>
{
	@Override
	public List<String> getAlternatives(IPlayer executor, String partial)
	{
		return argument.getAlternatives(executor, partial);
	}

	@Nullable
	@Override
	public String expand(ICommandExecutor context, @Nullable String value)
	{
		if (value == null)
			return null;
		String[] values = LIST_SEPARATOR.split(value);
		List<String> result = new ArrayList<>(values.length);
		for (String val : values)
		{
			String expanded = argument.expand(context, value);
			if (expanded != null)
				result.add(expanded);
		}
		return String.join(" ", result);
	}

	@Override
	public List<T> getValue(IPlayer context, Map<String, String> params)
	{
		String value = params.get(name);
		if (value == null)
			return null;
		String[] rawValues = LIST_SEPARATOR.split(value);
		List<T> values = Lists.newArrayList();
		Map<String, String> dummy = new HashMap<>(1);
		for (String val : rawValues)
		{
			dummy.put(name, val);
			T expanded = argument.getValue(context, dummy);
			if (expanded != null)
				values.add(expanded);
		}
		return values;
	}

	public ListOf<T> require()
	{
		required = true;
		return this;
	}

	@Override
	public boolean isRequired()
	{
		return required;
	}

	@Override
	public boolean isWhitespaceInclusive()
	{
		return true;
	}

	@Override
	public int length()
	{
		return name.length();
	}

	@Override
	public char charAt(int index)
	{
		return name.charAt(index);
	}

	@Override
	@Nonnull
	public CharSequence subSequence(int start, int end)
	{
		return name.subSequence(start, end);
	}

	@Nonnull
	@Override
	public String toString()
	{
		return name;
	}

	public interface Compatible<T> extends IArgument, IValueExpander, ITabComplete, IValueProvider<T>
	{
	}

	public ListOf(Compatible<T> argument)
	{
		name = argument.toString();
		this.argument = argument;
	}

	private boolean required;
	private final String name;
	private final Compatible<T> argument;
	static final Pattern LIST_SEPARATOR = Pattern.compile("\\s+");
}
