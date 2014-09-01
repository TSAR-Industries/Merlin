package com.richo.merlin.web.api;

import com.richo.merlin.api.WebApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Richo on 2014-09-01.
 */
public class WebApiServer implements WebApi
{
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public String hello(String msg)
	{
		logger.info("hello called with arg {}" + msg);
		return msg;
	}
}
