package no.runsafe.api.command;

import no.runsafe.api.IScheduler;

import javax.annotation.Nonnull;

public interface CommandScheduler extends ISyncExecute
{
	@Nonnull
    IScheduler getScheduler();
}
