package com.example.issue.aopissue.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

    @Before("execution(public * com.example.issue.aopissue.service..*.*(..))")
    public void process(JoinPoint joinPoint) {
        System.out.println("I was here: " + joinPoint.getTarget());
    }
}
