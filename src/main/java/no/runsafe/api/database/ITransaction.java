package no.runsafe.api.database;

public interface ITransaction extends IQueryExecutor
{
	void Commit();
	void Rollback();
}
