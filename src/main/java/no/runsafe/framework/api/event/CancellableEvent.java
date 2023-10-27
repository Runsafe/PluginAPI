package no.runsafe.framework.api.event;

import org.w3c.dom.events.Event;

public interface CancellableEvent extends EventArgs
{
	boolean isCancelled();
	void cancel();
	void addCancellationHandle(Runnable callback);
}
