package com.richo.merlin.api.web.model;

import com.sun.istack.internal.NotNull;

/**
 * Created by Richo on 2014-09-24.
 */
public class Room
{
	final private int id;
	final private String name;

	public Room(int id, @NotNull String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	@NotNull
	public String getName()
	{
		return name;
	}
}
