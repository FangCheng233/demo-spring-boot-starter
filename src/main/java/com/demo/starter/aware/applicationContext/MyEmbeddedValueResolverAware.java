package com.demo.starter.aware.applicationContext;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

/**
 * 注入 EmbeddedValueResolver（Spring EL解析器），一般用于参数解析；
 * @ClassName MyEmbeddedValueResolverAware
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/8/8 11:07 上午
 * @Version 1.0
 */
public class MyEmbeddedValueResolverAware implements EmbeddedValueResolverAware {
    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        System.out.println("---------stringValueResolver-----------");
    }
}
