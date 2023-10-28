package no.runsafe.api.database;

import no.runsafe.api.IWorld;
import no.runsafe.api.player.IPlayer;

import java.time.ZonedDateTime;

public interface IValue extends IResult
{
	String String();
	Integer Integer();
	Long Long();
	Double Double();
	Float Float();
	ZonedDateTime DateTime();
	IPlayer Player();
	IWorld World();
}
