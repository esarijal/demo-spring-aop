package com.mitrais.learn.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

// Configuration
// AOP
@Configuration
@Aspect
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around(value = "execution(* com.mitrais.learn.aopdemo.business.*.*(..))")// <--- POINTCUT)
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        // startTime = x
        // allowed execution
        // endTime = y

        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis() - startTime;

        logger.info("Time taken by {} is {}", joinPoint, endTime);
    }

}
