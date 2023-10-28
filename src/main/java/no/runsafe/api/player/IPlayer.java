package no.runsafe.api.player;

import no.runsafe.api.command.ICommandExecutor;
import no.runsafe.api.minecraft.IAnimalTamer;
import no.runsafe.api.entity.IEntity;
import no.runsafe.api.entity.ILivingEntity;

public interface IPlayer extends
	ILivingEntity, IServerOperator, IAnimalTamer, IPlayerGameplay, IPlayerInventory, IPlayerKinematics,
	IPlayerPermissions, IPlayerControl, IPlayerVisibility, IPlayerUniverse, IPlayerNotification, ICommandExecutor,
	IPlayerNetwork
{
	String getPrettyName();
	void setPlayerListName(String name);
	String getPlayerListName();
	IEntity getLeftShoulderEntity();
	IEntity getRightShoulderEntity();
	void setLeftShoulderEntity(IEntity entity);
	void setRightShoulderEntity(IEntity entity);
}
