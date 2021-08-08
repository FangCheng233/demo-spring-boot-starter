package com.demo.starter.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanFactoryPostProcessor
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/30 12:41 上午
 * @Version 1.0
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("[MyBeanFactoryPostProcessor]调用了postProcessBeanFactory");
        int count = beanFactory.getBeanDefinitionCount();
        System.out.println("[MyBeanFactoryPostProcessor]当前beanFactory共有" + count + "个bean");
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        //获取容器中所有的beanDefinition
        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
            if ("person".equals(beanName)) {
                //获取PersonDefinition对象
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
                MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
                System.out.println(propertyValues.toString());
                //修改定义中的name属性值
                propertyValues.addPropertyValue("name", "赵四");
                System.out.println("[MyBeanFactoryPostProcessor]postProcessBeanFactory方法中修改了name属性初始值了");
                System.out.println(propertyValues.toString());
            }
        }
    }
}
