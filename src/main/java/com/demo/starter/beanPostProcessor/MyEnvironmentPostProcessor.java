package com.demo.starter.beanPostProcessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyEnvironmentPostProcessor
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/29 2:24 下午
 * @Version 1.0
 */
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        System.out.println("-----MyEnvironmentPostProcessor postProcessEnvironment-----");
    }
}
