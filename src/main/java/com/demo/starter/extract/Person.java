package com.demo.starter.extract;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @ClassName Person
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/12/30 12:52 上午
 * @Version 1.0
 */
public class Person implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {
    private String name;
    private String sex;

    public Person() {
        System.out.println("Person无参构造器");

    }

    public Person(String name, String sex) {
        System.out.println("Person有参构造器:[name=" + name + ",sex=" + sex + "]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[Person]调用了BeanFactoryAware的setBeanFactory方法了");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("[Person]调用了BeanNameAware的setBeanName方法了:" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("[Person]调用了DisposableBean的destroy方法了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[Person]调用了Initailization的afterPropertiesSet方法了");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", sex=" + sex
                + "]";
    }
}
