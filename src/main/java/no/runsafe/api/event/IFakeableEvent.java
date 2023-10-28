package no.runsafe.api.event;

public interface IFakeableEvent extends EventArgs
{
	boolean Fire();
	boolean isFake();
}
