package com.demo.starter.initializingBean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName BeanDemo
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/7/15 10:37 下午
 * @Version 1.0
 */
@Slf4j
public class BeanDemo implements InitializingBean, DisposableBean {

    public BeanDemo() {
        System.out.println("调用构造器--");
    }
    /**
     * Sets the str. *
     * <p>You can use getStr() to get the value of str</p>
     * * @param str str
     */

    public void init(){
        System.out.println("调用init");
    }

    public void stop(){
        System.out.println("调用stop");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("调用destroy");
    }
}
