package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        MemberDTO member = context.getBean(MemberDTO.class);
//        System.out.println("member = " + member);

        System.out.println(member.getPersonalAccount());
        System.out.println(member.getPersonalAccount().deposit(1000000));
        System.out.println(member.getPersonalAccount().getBalance());
        System.out.println(member.getPersonalAccount().withDraw(300000));
        System.out.println(member.getPersonalAccount().getBalance());

    }
}
