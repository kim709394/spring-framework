package org.springframework.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ioc.IocApplication;
import org.springframework.ioc.MyLifeCycleBean;

/**
 * @author huangjie
 * @description
 * @date 2022/1/12
 */
public class IocTest {


	/**
	 * 生命周期源码调用栈剖析
	 *
	 * */
	@Test
	public void beanLifeCycle(){

		ApplicationContext context=new AnnotationConfigApplicationContext(IocApplication.class);
		MyLifeCycleBean bean = context.getBean(MyLifeCycleBean.class);
		System.out.println(bean);
		((AnnotationConfigApplicationContext)context).close();
	}

}
