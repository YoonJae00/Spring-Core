package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

//        MemberDTO member = context.getBean(MemberDTO.class);

        MemberDTO member = context.getBean("getmember", MemberDTO.class);
        System.out.println("member = " + member);
    }
}
