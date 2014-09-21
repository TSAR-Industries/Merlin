package com.richo.merlin.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/web")
public interface WebApi
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	String hello();

	@DELETE
	String del();

	@GET
	@Path("/{id}/")
	String getStuff(@PathParam("id") String id);
}
	