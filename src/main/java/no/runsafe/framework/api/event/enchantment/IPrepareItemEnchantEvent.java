package no.runsafe.framework.api.event.enchantment;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IPrepareItemEnchantEvent extends IRunsafeEvent
{
	void OnPrepareItemEnchantEvent(PrepareItemEnchantEventArgs event);
}

