package com.aoptest2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aoptest2")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {

}
