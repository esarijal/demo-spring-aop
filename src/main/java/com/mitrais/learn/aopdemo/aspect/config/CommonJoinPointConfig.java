package com.mitrais.learn.aopdemo.aspect.config;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.mitrais.learn.aopdemo.business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("execution(* com.mitrais.learn.aopdemo.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("com.mitrais.learn.aopdemo.aspect.config.CommonJoinPointConfig.businessLayerExecution() " +
            "&& " +
            "com.mitrais.learn.aopdemo.aspect.config.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    @Pointcut("within(com.mitrais.learn.aopdemo.business..*)")
    public void businessLayerExecutionWithWithin(){}

    @Pointcut("@annotation(com.mitrais.learn.aopdemo.aspect.annotation.TrackTime)")
    public void trackTimeAnnotation(){}
}
