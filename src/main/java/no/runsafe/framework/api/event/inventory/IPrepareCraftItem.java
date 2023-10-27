package no.runsafe.framework.api.event.inventory;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPrepareCraftItem extends IRunsafeEvent
{
	void OnPrepareCraftItem(PrepareItemCraftEventArgs event);
}
