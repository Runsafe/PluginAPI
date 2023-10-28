package no.runsafe.api.metadata;

import no.runsafe.api.server.IMetadataValue;
import no.runsafe.api.server.IPlugin;

import java.util.List;

public interface IMetadata
{
	List<IMetadataValue> getMetadata(String key);
	boolean hasMetadata(String key);
	void removeMetadata(String key, IPlugin plugin);
	void setMetadata(String key, IMetadataValue value);
}