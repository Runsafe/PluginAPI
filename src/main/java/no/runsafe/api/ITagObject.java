package no.runsafe.api;

public interface ITagObject
{
	boolean hasTagKey(String key);
	String getTagCompoundValue(String key);
	void setTagCompound(String key, String value);
	Object getTagCompound();
	Object cloneWithNewCompound(Object compound);
}
