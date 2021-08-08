package com.demo.starter;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName MyApplicationContextInitializer
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/29 1:43 下午
 * @Version 1.0
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("-----MyApplicationContextInitializer initialize-----");
    }
}
