package com.str.model.impl;

import com.str.cdi.BeanIdentifier;
import com.str.cdi.BeanTypeEnum;
import com.str.model.SimpleBean;

@BeanIdentifier({BeanTypeEnum.TWO})
public class AnotherAppScopedSimpleBeanImpl implements SimpleBean {

	public final String message;
	
	public AnotherAppScopedSimpleBeanImpl(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
