package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames) {
            System.out.println("beanName = " + bean);
        }

        System.out.println("==================================");

        MemberService memberService = context.getBean("memberService", MemberService.class);

        System.out.println("========== 전체 조회 ==========");
        System.out.println(memberService.selectMembers());
        System.out.println("========== 단일 조회 ==========");
        System.out.println(memberService.selectMember(1L));


    }
}
