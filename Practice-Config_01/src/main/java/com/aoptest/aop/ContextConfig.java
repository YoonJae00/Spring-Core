package com.aoptest.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aoptest.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfig {

}
