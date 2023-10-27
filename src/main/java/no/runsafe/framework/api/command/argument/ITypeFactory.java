package no.runsafe.framework.api.command.argument;

import no.runsafe.framework.api.minecraft.RunsafeEntityType;

import java.util.List;

public interface ITypeFactory {
    <T> T getByName(String name);
	<T> T[] getMatchesByName(String filter);
	<T> T[] getAll();
}
