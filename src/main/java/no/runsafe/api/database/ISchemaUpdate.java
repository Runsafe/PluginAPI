package no.runsafe.api.database;

public interface ISchemaUpdate
{
	void addQueries(String... queries);

	Iterable<Integer> getRevisions();

	Iterable<String> getStatements(int revision);
}
