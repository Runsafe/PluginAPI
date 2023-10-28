package no.runsafe.api.command.argument;

import no.runsafe.api.command.ICommandExecutor;

import javax.annotation.Nullable;

public interface IValueExpander
{
	@Nullable
	String expand(ICommandExecutor context, @Nullable String value);
}
