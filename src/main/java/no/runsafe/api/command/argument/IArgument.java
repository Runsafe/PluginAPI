package no.runsafe.api.command.argument;

public interface IArgument extends CharSequence
{
	boolean isRequired();
	boolean isWhitespaceInclusive();
}
