package com.str.model.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.str.cdi.BeanIdentifier;
import com.str.cdi.BeanTypeEnum;
import com.str.model.SimpleBean;

@ApplicationScoped
public class SimpleBeanFactory {

	@Produces
	@BeanIdentifier({BeanTypeEnum.ONE,BeanTypeEnum.THREE})
	@ApplicationScoped
	public SimpleBean produceSimpleBean()
	{
		final String message = "This is the SimpleBeanImpl.";
		return new AppScopedSimpleBeanImpl(message);
	}
	
	@Produces
	@BeanIdentifier({BeanTypeEnum.TWO})
	@ApplicationScoped
	public SimpleBean produceAnotherSimpleBean()
	{
		final String message = "This is the SimpleBeanImpl.";
		return new AnotherAppScopedSimpleBeanImpl(message);
	}
}
