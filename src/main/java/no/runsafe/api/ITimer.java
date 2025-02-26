package no.runsafe.api;

public interface ITimer
{
	void cancel();

	void resetSeconds(int seconds);

	void resetTicks(Long ticks);

	void stop();

	void start();

	boolean isDone();
}
