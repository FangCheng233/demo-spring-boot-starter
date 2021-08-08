package com.demo.starter.aware.beanFactory;

import org.springframework.beans.factory.BeanClassLoaderAware;

/**
 * 注入加载当前 bean 的 ClassLoader；
 * @ClassName MyBeanClassLoaderAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:19 上午
 * @Version 1.0
 */
public class MyBeanClassLoaderAware implements BeanClassLoaderAware {
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("---------classLoader----------");
    }
}
