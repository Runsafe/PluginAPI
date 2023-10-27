package no.runsafe.framework.api.event.enchantment;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEnchantItemEvent extends IRunsafeEvent
{
	void OnEnchantItemEvent(EnchantItemEventArgs event);
}

