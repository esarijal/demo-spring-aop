package com.mitrais.learn.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Configuration
// AOP
@Configuration
@Aspect
public class AfterAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..)) <- POINTCUT

    // Combination of POINTCUT + ADVICE = ASPECT
    // JoinPoint -> spesific execution instance (usually methods)
    // Weaving(The process ) and Weaver (The framework)

    @AfterReturning(
            value = "com.mitrais.learn.aopdemo.aspect.config.CommonJoinPointConfig" +
                    ".businessLayerExecution()",// <---
            // POINTCUT
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result){
        // What to do? All below logic is ADVICE
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "com.mitrais.learn.aopdemo.aspect.config.CommonJoinPointConfig" +
                    ".businessLayerExecution()",// <---
            // POINTCUT
            throwing = "exception"
    )
    public void afterThrowing(JoinPoint joinPoint, Object exception){
        // What to do? All below logic is ADVICE
        logger.info("{} throw exception {}", joinPoint, exception);
    }

    @After(value = "com.mitrais.learn.aopdemo.aspect.config.CommonJoinPointConfig" +
            ".businessLayerExecution()")// <---
    // POINTCUT)
    public void after(JoinPoint joinPoint){
        // What to do? All below logic is ADVICE
        logger.info("completed execution of {}", joinPoint);
    }
}
;