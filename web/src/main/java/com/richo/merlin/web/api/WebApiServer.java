package com.richo.merlin.web.api;

import com.richo.merlin.api.model.Player;
import com.richo.merlin.api.model.Room;
import com.richo.merlin.api.WebApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.PathParam;

/**
 * Created by Richo on 2014-09-01.
 */
public class WebApiServer implements WebApi
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public Room[] getAllRooms()
	{
		logger.info("Get all rooms");
		return new Room[]{new Room(1, "room_name"), new Room(2, "room_name2")};
	}

	@Override
	public Room getRoom(String id)
	{
		logger.info("Get room with id {}", id);
		return new Room(1, "room_name");
	}

	@Override
	public Player[] getAllPlayersInRoom(String id)
	{
		logger.info("Get all players in room {}", id);
		return new Player[]{new Player("Anders"), new Player("Berta-Åsa")};
	}
}
