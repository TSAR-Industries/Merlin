package com.richo.merlin.api.model;

/**
 * Created by Richo on 2014-09-24.
 */
public class Room
{
	final private int id;
	final private String name;

	public Room(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}
}
