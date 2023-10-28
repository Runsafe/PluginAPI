package no.runsafe.framework.api.command.argument;

public interface ITypeFactory {
    <T> T getByName(String name);
	<T> T[] getMatchesByName(String filter);
	<T> T[] getAll();
}
