package com.str.model.impl;

import com.str.model.SimpleBean;

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
