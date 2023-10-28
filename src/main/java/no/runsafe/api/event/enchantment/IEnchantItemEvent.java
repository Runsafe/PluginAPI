package no.runsafe.api.event.enchantment;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEnchantItemEvent extends IRunsafeEvent
{
	void OnEnchantItemEvent(EnchantItemEventArgs event);
}

