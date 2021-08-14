package com.demo.starter.register;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * ImportBeanDefinitionRegistrar类只能通过其他类@Import的方式来加载，用来动态扫描注册bean
 * @ClassName MyImportBeanDefinitionRegistrar
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 12:36 下午
 * @Version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println("-------------import--------------");
    }
}
