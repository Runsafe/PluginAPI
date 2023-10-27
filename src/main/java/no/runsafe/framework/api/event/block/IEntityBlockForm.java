package no.runsafe.framework.api.event.block;

import no.runsafe.framework.api.entity.IEntity;
import no.runsafe.framework.api.event.CancellableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;

public interface IEntityBlockForm extends IRunsafeEvent
{
	void OnEntityBlockForm(EntityBlockFormEventArgs event);
}

