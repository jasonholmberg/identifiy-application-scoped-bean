package com.str.service;

import com.str.cdi.BeanTypeEnum;
import com.str.model.SimpleBean;

public interface BeanService<T> {
	T lookup(BeanTypeEnum beanTypeEnum);
}
