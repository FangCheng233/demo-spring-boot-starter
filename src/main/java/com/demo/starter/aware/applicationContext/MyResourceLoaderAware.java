package com.demo.starter.aware.applicationContext;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * @ClassName MyResourceLoaderAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:09 上午
 * @Version 1.0
 */
public class MyResourceLoaderAware implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("-------resourceLoader---------");
    }
}
