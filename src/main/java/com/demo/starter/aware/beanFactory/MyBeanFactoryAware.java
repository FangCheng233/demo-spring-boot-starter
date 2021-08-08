package com.demo.starter.aware.beanFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * 注入 当前BeanFactory容器 的引用。
 * @ClassName MyBeanFactoryAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:20 上午
 * @Version 1.0
 */
public class MyBeanFactoryAware implements BeanFactoryAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}
