package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface ICraftItem extends IRunsafeEvent
{
	void OnCraftItem(CraftItemEventArgs event);
}
