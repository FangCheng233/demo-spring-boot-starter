package com.demo.starter.aware.beanFactory;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 注入当前 bean 对应 beanName；
 * @ClassName MyBeanNameAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/6 3:31 下午
 * @Version 1.0
 */
public class MyBeanNameAware implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("---------beanName---------");
    }
}
