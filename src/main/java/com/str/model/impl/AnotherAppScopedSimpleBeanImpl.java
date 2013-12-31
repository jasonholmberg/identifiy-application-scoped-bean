package com.str.model.impl;

import com.str.model.SimpleBean;

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
