package no.runsafe.framework.api.event;

public interface CancellableEvent extends EventArgs
{
	boolean isCancelled();
	void cancel();
	void addCancellationHandle(Runnable callback);
}
