package com.demo.starter.aware.applicationContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * 注入 ApplicationContext 容器本身
 * @ClassName MyApplicationContextAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/15 7:26 下午
 * @Version 1.0
 */
public class MyApplicationContextAware implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("-----MyApplicationContextAware initialize-----");
        Optional.ofNullable(this.applicationContext).orElse(this.applicationContext = applicationContext);
    }
}
