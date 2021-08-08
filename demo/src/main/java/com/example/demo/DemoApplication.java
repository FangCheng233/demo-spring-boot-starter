package com.example.demo;

import com.demo.starter.initializingBean.BeanDemo;
import com.demo.starter.register.MyImportBeanDefinitionRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 *@ClassName DemoApplication
 *@Description TODO
 *@Author fangcheng
 *@Date 2021/4/27 10:06 上午
 *@Version 1.0
 */

@Import(MyImportBeanDefinitionRegistrar.class)
@SpringBootApplication
//@ComponentScan({"com.*.*"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        ConfigurableApplicationContext applicationContext = application.run(args);
//        SpringApplication.exit(applicationContext);
    }
    @Bean(initMethod = "init",destroyMethod = "stop")
    public BeanDemo beanDemo(){
        return new BeanDemo();
    }
}
