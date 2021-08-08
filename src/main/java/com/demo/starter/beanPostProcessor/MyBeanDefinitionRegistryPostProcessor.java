package com.demo.starter.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanDefinitionRegistryPostProcessor
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 1:42 下午
 * @Version 1.0
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("----BeanDefinitionRegistryPostProcessor------registry---");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("----BeanDefinitionRegistryPostProcessor------beanFactory---");
    }
}
