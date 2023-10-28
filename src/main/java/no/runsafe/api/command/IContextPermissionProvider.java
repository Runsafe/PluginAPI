package no.runsafe.api.command;

import no.runsafe.api.command.argument.IArgumentList;

public interface IContextPermissionProvider
{
	String getPermission(ICommandExecutor executor, IArgumentList parameters, String... args);
}
