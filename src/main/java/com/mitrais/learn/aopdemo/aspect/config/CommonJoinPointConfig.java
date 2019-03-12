package com.mitrais.learn.aopdemo.aspect.config;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.mitrais.learn.aopdemo.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("execution(* com.mitrais.learn.aopdemo.data.*.*(..))")
    public void dataLayerExecution(){}
}
