package com.demo.starter.aware.applicationContext;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * 注入 Enviroment，一般用于获取配置属性
 * @ClassName MyEnvironmentAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:00 上午
 * @Version 1.0
 */
public class MyEnvironmentAware implements EnvironmentAware {
    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("---------environment--------");
    }
}
