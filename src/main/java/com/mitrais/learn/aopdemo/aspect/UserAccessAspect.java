package com.mitrais.learn.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Configuration
// AOP
@Configuration
@Aspect
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))

    @Before("execution(* com.mitrais.learn.aopdemo.business.*.*(..))")
    public void before(JoinPoint joinPoint){
        // What to do?
        logger.info("Check for user access  ");
        logger.info("Allowed execution for {} ", joinPoint);
    }
}
;