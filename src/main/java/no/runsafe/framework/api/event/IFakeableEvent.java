package no.runsafe.framework.api.event;

public interface IFakeableEvent extends EventArgs
{
	boolean Fire();
	boolean isFake();
}
