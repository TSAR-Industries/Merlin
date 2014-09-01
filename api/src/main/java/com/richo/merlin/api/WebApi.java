package com.richo.merlin.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/web")
public interface WebApi
{
	@GET
	String hello(String msg);
}
