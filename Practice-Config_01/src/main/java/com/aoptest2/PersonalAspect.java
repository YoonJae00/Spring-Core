package com.aoptest2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
@Aspect
public class PersonalAspect {

    @Pointcut("execution(* com.aoptest2.*Service.*(..))")
    public void gogopw() {
    }


    @Around("gogopw()")
    public Object before(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        if (result instanceof PersonalDAO) {
            PersonalDAO personalDAO = (PersonalDAO) result;
            String personPW1 = personalDAO.showPW(1);
            String base64PW1 = Base64.getEncoder().encodeToString(personPW1.getBytes());
            personalDAO.setPW(1, base64PW1);
            String personPW2 = personalDAO.showPW(2);
            String base64PW2 = Base64.getEncoder().encodeToString(personPW2.getBytes());
            personalDAO.setPW(2, base64PW2);
            String personPW3 = personalDAO.showPW(3);
            String base64PW3 = Base64.getEncoder().encodeToString(personPW3.getBytes());
            personalDAO.setPW(3, base64PW3);
            String personPW4 = personalDAO.showPW(4);
            String base64PW4 = Base64.getEncoder().encodeToString(personPW4.getBytes());
            personalDAO.setPW(4, base64PW4);
            String personPW5 = personalDAO.showPW(5);
            String base64PW5 = Base64.getEncoder().encodeToString(personPW5.getBytes());
            personalDAO.setPW(5, base64PW5);
        }
        return result;
    }
}
