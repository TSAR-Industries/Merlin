package com.richo.merlin.api.web.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by Richo on 2014-09-24.
 */
public class Player
{
	private final String name;
	private final PlayerId id;

	public Player(@NotNull final PlayerId id, @NotNull final String name)
	{
		this.name = name;
		this.id = id;
	}

	@NotNull
	public String getName()
	{
		return name;
	}

	@NotNull
	public PlayerId getId()
	{
		return id;
	}

	@Override
	public String toString()
	{
		return "Player{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}
}
