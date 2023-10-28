package no.runsafe.api.event.enchantment;

import no.runsafe.api.event.IRunsafeEvent;

public interface IPrepareItemEnchantEvent extends IRunsafeEvent
{
	void OnPrepareItemEnchantEvent(PrepareItemEnchantEventArgs event);
}

