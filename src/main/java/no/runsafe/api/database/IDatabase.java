package no.runsafe.api.database;

public interface IDatabase extends IQueryExecutor
{
	ITransaction isolate();
}
