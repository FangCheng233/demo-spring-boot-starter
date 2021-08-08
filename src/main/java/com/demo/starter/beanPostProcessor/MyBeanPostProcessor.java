package com.demo.starter.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanPostProcessor
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/30 12:58 上午
 * @Version 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
//        System.out.println("[MyBeanPostProcessor]后置处理器处理bean=【" + beanName + "】开始");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
//        System.out.println("[MyBeanPostProcessor]后置处理器处理bean=【" + beanName + "】完毕!");
        return bean;
    }
}
