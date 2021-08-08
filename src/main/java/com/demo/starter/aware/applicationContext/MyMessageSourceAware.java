package com.demo.starter.aware.applicationContext;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * @ClassName MyMessageSourceAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:13 上午
 * @Version 1.0
 */
public class MyMessageSourceAware implements MessageSourceAware {
    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("--------messageSource----------");
    }
}
