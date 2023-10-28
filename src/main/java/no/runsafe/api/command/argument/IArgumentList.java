package no.runsafe.api.command.argument;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;

public interface IArgumentList
{
	boolean isAborted();
	int size();
	boolean has(String param);
	@Nullable
	<T> T getValue(String param);
	@Nonnull
	<T> T getRequired(String param);
	@Nonnull
	Set<Map.Entry<String, String>> entrySet();
}
