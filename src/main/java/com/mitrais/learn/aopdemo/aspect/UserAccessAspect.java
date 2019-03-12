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
    //execution(* PACKAGE.*.*(..)) <- POINTCUT

    // Combination of POINTCUT + ADVICE = ASPECT
    // JoinPoint -> spesific execution instance (usually methods)
    // Weaving(The process ) and Weaver (The framework)

    @Before("execution(* com.mitrais.learn.aopdemo.business.*.*(..))") // <--- POINTCUT
    public void before(JoinPoint joinPoint){
        // What to do? All below logic is ADVICE
        logger.info("Check for user access  ");
        logger.info("Allowed execution for {} ", joinPoint);
    }
}
;