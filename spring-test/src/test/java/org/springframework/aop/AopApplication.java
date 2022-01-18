package org.springframework.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author huangjie
 * @description
 * @date 2022-01-18
 */
//声明这是一个配置类
@Configuration
//设置注解扫描包路径，扫描此包和此包的子包的所有spring注解
@ComponentScan(basePackages = "org.springframework.aop")
//开启aop注解支持
@EnableAspectJAutoProxy
public class AopApplication {



}
