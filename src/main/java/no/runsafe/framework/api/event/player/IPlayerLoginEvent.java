package no.runsafe.framework.api.event.player;

import no.runsafe.framework.api.event.IFakeableEvent;
import no.runsafe.framework.api.event.IRunsafeEvent;

import java.net.InetAddress;


public interface IPlayerLoginEvent extends IRunsafeEvent
{
	void OnPlayerLogin(PlayerLoginEventArgs event);
}
