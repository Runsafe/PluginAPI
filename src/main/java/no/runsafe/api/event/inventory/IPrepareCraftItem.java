package no.runsafe.api.event.inventory;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPrepareCraftItem extends IRunsafeEvent
{
	void OnPrepareCraftItem(PrepareItemCraftEventArgs event);
}
