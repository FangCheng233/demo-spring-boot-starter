package com.demo.starter.aware.applicationContext;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @ClassName MyApplicationEventPublisherAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:12 上午
 * @Version 1.0
 */
public class MyApplicationEventPublisherAware implements ApplicationEventPublisherAware {
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("------applicationEventPublisher--------");
    }
}
