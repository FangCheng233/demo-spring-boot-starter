package com.demo.starter.extract;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ExtConfig
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/30 12:55 上午
 * @Version 1.0
 */
@ComponentScan("com.demo.starter")
@Configuration
public class ExtConfig {
    @Bean
    public Person person() {
        return new Person("张三", "男");
    }
}
