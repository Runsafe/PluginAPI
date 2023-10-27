package no.runsafe.framework.api.command;

import no.runsafe.framework.api.command.argument.IArgumentList;

import java.util.Stack;

public interface ICommandPreparer {
    IPreparedCommand prepareAsyncCommand(ICommandExecutor executor, Stack<ICommandHandler> stack, String[] args, IArgumentList params);
}
