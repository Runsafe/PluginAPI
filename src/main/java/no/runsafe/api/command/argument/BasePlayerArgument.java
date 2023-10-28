package no.runsafe.api.command.argument;

import no.runsafe.api.GlobalKernel;
import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.player.IPlayer;
import no.runsafe.api.server.IPlayerProvider;

import javax.annotation.Nullable;
import java.util.List;

public abstract class BasePlayerArgument extends CommandArgumentSpecification<IPlayer> implements ListOf.Compatible<IPlayer> {
    protected BasePlayerArgument(String name) {
        this(name, false);
    }

    protected BasePlayerArgument(String name, boolean context) {
        super(name);
        expand = context;
        factory = GlobalKernel.Instance.getGlobalComponent(IPlayerProvider.class);
    }

    @Override
    public boolean isWhitespaceInclusive() {
        return false;
    }

    @Override
    public List<String> getAlternatives(IPlayer executor, String partial) {
        return factory.getOnlinePlayers(executor, partial);
    }

    @Nullable
    @Override
    public String expand(ICommandExecutor context, @Nullable String value) {
        if (expand && value == null)
            return context.getName();

        return null;
    }

    protected boolean expand;
    protected final IPlayerProvider factory;
}
