package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface ICraftItem extends IRunsafeEvent
{
	void OnCraftItem(CraftItemEventArgs event);
}
