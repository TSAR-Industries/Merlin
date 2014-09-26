package com.richo.merlin.backend.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.richo.merlin.api.backend.BackendApi;
import com.richo.merlin.backend.BackendApiImpl;

public class BackendModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		bind(BackendApi.class).to(BackendApiImpl.class);
	}

	public static Injector getInstance()
	{
		return InectorHolder.INSTANCE;
	}

	private static class InectorHolder
	{
		private static final Injector INSTANCE = Guice.createInjector(new BackendModule());
	}
}
