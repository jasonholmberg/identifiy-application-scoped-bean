package com.str.model.impl;

import com.str.cdi.BeanIdentifier;
import com.str.cdi.BeanTypeEnum;
import com.str.model.SimpleBean;

@BeanIdentifier({BeanTypeEnum.ONE,BeanTypeEnum.THREE})
public class AppScopedSimpleBeanImpl implements SimpleBean {

	public final String message;
	
	public AppScopedSimpleBeanImpl(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
