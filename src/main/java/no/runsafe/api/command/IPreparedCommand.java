package no.runsafe.api.command;

import no.runsafe.api.command.argument.IArgument;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface IPreparedCommand
{
	@Nullable
	String getRequiredPermission();
	@Nullable
	String execute();
	@Nullable
	String executeDirect();
	@Nullable
	Iterable<String> tabComplete(String... args);

	@Nullable
	Iterable<String> getSuggestions(@Nonnull IArgument param, @Nonnull String... args);

	int countSuperParams();

	String usage(ICommandHandler target);
}
