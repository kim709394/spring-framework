package org.springframework.test;

import org.junit.Test;
import org.springframework.aop.AopApplication;
import org.springframework.aop.BusinessHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huangjie
 * @description
 * @date 2022-01-18
 */
public class AopTest {

	//aop源码追踪刨析
	@Test
	public void aop(){
		ApplicationContext app=new AnnotationConfigApplicationContext(AopApplication.class);

		BusinessHandler businessHandler = app.getBean(BusinessHandler.class);
		businessHandler.handle("kim");

	}


}
