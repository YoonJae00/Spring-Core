package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan("com.ohgiraffers.section01.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {


}
