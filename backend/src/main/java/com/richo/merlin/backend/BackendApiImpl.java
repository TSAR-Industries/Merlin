package com.richo.merlin.backend;

import com.richo.merlin.api.backend.BackendApi;
import com.richo.merlin.api.web.model.Player;
import com.richo.merlin.api.web.model.Room;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class BackendApiImpl implements BackendApi
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	private final PlayerManager playerManager;

	@Inject
	public BackendApiImpl(@NotNull final PlayerManager playerManager)
	{
		this.playerManager = playerManager;
	}

	@Override
	@NotNull
	public Room[] getAllRooms()
	{
		logger.info("Get all rooms");
		return new Room[]{new Room(1, "Richo's room"), new Room(2, "Anders' room")};
	}

	@Override
	@NotNull
	public Room getRoom(int id)
	{
		return new Room(12, "Your room");
	}

	@Override
	@NotNull
	public Room createRoom(@NotNull String roomName)
	{
		return new Room(-1, roomName);
	}

	@Override
	@NotNull
	public Player createPlayer(String playerName)
	{
		logger.info("Create player {}", playerName);
		final Player player = playerManager.create(playerName);
		return player;
	}
}
