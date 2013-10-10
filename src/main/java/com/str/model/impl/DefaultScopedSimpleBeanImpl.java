package com.str.model.impl;

import com.str.cdi.BeanIdentifier;
import com.str.cdi.BeanTypeEnum;
import com.str.model.SimpleBean;

@BeanIdentifier({BeanTypeEnum.FOUR})
public class DefaultScopedSimpleBeanImpl implements SimpleBean {

	public DefaultScopedSimpleBeanImpl() {
		// For CDI
	}

	@Override
	public String getMessage() {
		return "This is a message from the DefaultScopedSimpleBeanImpl";
	}

}
