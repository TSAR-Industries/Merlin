package com.richo.merlin.api.backend;


import com.richo.merlin.api.web.model.Player;
import com.richo.merlin.api.web.model.Room;
import com.sun.istack.internal.NotNull;

public interface BackendApi
{
	@NotNull
	Room[] getAllRooms();

	@NotNull
	Room getRoom(int id);

	@NotNull
	Room createRoom(@NotNull String roomName);

	@NotNull
	Player createPlayer(@NotNull String playerName);
}
