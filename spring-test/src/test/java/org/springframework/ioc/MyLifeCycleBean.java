package org.springframework.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author huangjie
 * @description  生命周期处理器bean
 * @date 2022/1/12
 */
@Component
public class MyLifeCycleBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean  {

	@Value("myLifeCyceBean")
	private String name;


	public MyLifeCycleBean(){
		System.out.println("2、new myLifeCycleBean ....and setter");
	}


	/**
	 * bean实现BeanNameAware接口重写setBeanName方法
	 * 获得当前bean的name值
	 * */
	@Override
	public void setBeanName(String s) {
		System.out.println("3、当前生命周期bean的name值:"+s);
	}

	/**
	 * bean实现BeanFactoryAware接口重写setBeanFactory方法
	 * 获得bean工厂对象，这个对象是ioc容器applicationContext的父接口
	 * */
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4、当前生命周期bean工厂对象:"+beanFactory.toString());
	}

	/**
	 * bean实现ApplicationContextAware接口重写setApplicationContext方法
	 * 获得ioc容器applicationContext对象，这个对象可以获取bean对象
	 * */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)  {
		System.out.println("5、获取ioc容器上下文对象:"+applicationContext);
	}

	/**
	 * bean实现InitializingBean接口重写afterPropertiesSet方法
	 * bean在属性注入之后调用的方法
	 * */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("8、myBeanLifeCycle after properties set");
	}

	/**
	 * bean实现DisposableBean接口重写destroy方法
	 * 容器销毁的时候调用此方法
	 * */
	@Override
	public void destroy() throws Exception {
		System.out.println("11、myBeanLifeCycle destory....");
	}


	/**
	 * 初始化方法
	 * */
	@PostConstruct
	public void init(){
		System.out.println("7、myBeanLifeCycle init...");

	}

	/**
	 * 容器销毁前调用的方法
	 * */
	@PreDestroy
	public void destory(){
		System.out.println("10、myBeanLifeCycle preDestory...");
	}


}
