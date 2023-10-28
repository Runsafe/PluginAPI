package no.runsafe.api.event.block;

import no.runsafe.api.event.IRunsafeEvent;

public interface IEntityBlockForm extends IRunsafeEvent
{
	void OnEntityBlockForm(EntityBlockFormEventArgs event);
}

