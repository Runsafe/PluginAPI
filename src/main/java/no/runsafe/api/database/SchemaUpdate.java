package no.runsafe.api.database;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class SchemaUpdate implements ISchemaUpdate
{
	@Override
	public void addQueries(String... queries)
	{
		this.queries.put(currentRevision, Arrays.asList(queries));
		currentRevision++;
	}

	@Override
	public Iterable<Integer> getRevisions()
	{
		return queries.keySet();
	}

	@Override
	public Iterable<String> getStatements(int revision)
	{
		return queries.get(revision);
	}

	private int currentRevision = 1;
	private final HashMap<Integer, List<String>> queries = new LinkedHashMap<>(0);
}
