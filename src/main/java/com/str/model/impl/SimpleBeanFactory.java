package com.str.model.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.str.model.SimpleBean;

@ApplicationScoped
public class SimpleBeanFactory {

	@Produces
	@ApplicationScoped
	public SimpleBean produceSimpleBean()
	{
		final String message = "This is the SimpleBeanImpl.";
		return new AppScopedSimpleBeanImpl(message);
	}
	
	@Produces
	@ApplicationScoped
	public SimpleBean produceAnotherSimpleBean()
	{
		final String message = "This is the SimpleBeanImpl.";
		return new AnotherAppScopedSimpleBeanImpl(message);
	}
}
