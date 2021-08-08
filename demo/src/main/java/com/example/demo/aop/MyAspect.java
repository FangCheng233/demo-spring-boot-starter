package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyAspect
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/30 9:31 下午
 * @Version 1.0
 */
@Aspect
@Component
public class MyAspect {

    @Around(value = "execution(public * com.example.demo.Controller.*(..))")
    public Object doBefore(ProceedingJoinPoint point) throws Throwable {
        Object obj = null;
        System.out.println("——————————[MyAspect]切入到[Person]中——————————");
        obj = point.proceed();
        return obj;
    }
}
