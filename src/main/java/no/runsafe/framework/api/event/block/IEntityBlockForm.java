package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityBlockForm extends IRunsafeEvent
{
	void OnEntityBlockForm(EntityBlockFormEventArgs event);
}

