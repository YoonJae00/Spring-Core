package com.aoptest.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);

        MemberService memberService = context.getBean(MemberService.class);

        memberService.showALLBMI();

    }
}
