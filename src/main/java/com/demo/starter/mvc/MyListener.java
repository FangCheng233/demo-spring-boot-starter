package com.demo.starter.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 在Springboot-starter 中 spring.factories中配置
 * <br/>org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.demo.starter.mvc.MyListener
 * @ClassName MyListener
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/1/4 3:46 下午
 * @Version 1.0
 */
public class MyListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {
    /**
     * ServletContextListener 接口方法重写
     * @param servletContextEvent
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextListener.contextInitialized方法被调用");
    }

    /**
     * ServletContextListener 接口方法重写
     * @param servletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContextListener.contextDestroyed方法被调用");
    }

    /**
     * HttpSessionListener 接口方法重写
     * @param se
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("HttpSessionListener----Created" + session.getId());
    }

    /**
     * HttpSessionListener 接口方法重写
     * @param se
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println("HttpSessionListener----Destroyed" + session.getId());
    }

    /**
     * ServletRequestListener 接口方法重写
     * @param sre
     */
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequestListener.super.requestDestroyed(sre);
    }

    /**
     * ServletRequestListener 接口方法重写
     * @param sre
     */
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequestListener.super.requestInitialized(sre);
    }
}
