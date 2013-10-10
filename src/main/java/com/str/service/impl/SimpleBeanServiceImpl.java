package com.str.service.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.UnsatisfiedResolutionException;
import javax.inject.Inject;

import com.str.cdi.BeanIdentifier;
import com.str.cdi.BeanTypeEnum;
import com.str.model.SimpleBean;
import com.str.service.BeanService;

public class SimpleBeanServiceImpl implements BeanService<SimpleBean> {

	private static final Logger log = Logger.getLogger(SimpleBeanServiceImpl.class.getName());
	
	@Inject 
	@Any
	private Instance<SimpleBean> simpleBeans;
	
	
	public SimpleBeanServiceImpl() {
		// For CDI
	}

	@Override
	public SimpleBean lookup(BeanTypeEnum identifier) {
		log.info("Getting service for BeanType: " + identifier);
		SimpleBean simpleBean = null;
		Iterator<?> iter = simpleBeans.iterator();
        while(iter.hasNext()) {
        	SimpleBean instance = (SimpleBean) iter.next();
        	try {
        		BeanTypeEnum[] beanTypeEnums = instance.getClass().getAnnotation(BeanIdentifier.class).value();
        		if (Arrays.asList(beanTypeEnums).contains(identifier)) {
        			simpleBean = instance;
        		}
        	} catch (Exception e) {
        		log.log(Level.SEVERE, "Error identifying bean of type "+identifier.name());
        		simpleBean = null;
        	}
        }
        if (simpleBean == null)
        	throw new UnsatisfiedResolutionException();
        
        return simpleBean;
	}
}
