package com.aoptest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        PersonalService personalServices = context.getBean(PersonalService.class);

        personalServices.showPW();
    }
}
