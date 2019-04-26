package com.myself.spring.lifecycle.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 【name】毛攀攀
 * @author 【date】2019/04/25
 * @author 【时间】22:47
 * @author 【说明】
 * @author 【工程】test-spring-lifecycle-demo
 * @author 【目录】com.myself.spring.lifecycle.common
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public MyBeanPostProcessor() {
        super();
        System.out.println("3、实例化BeanPostProcessor实现类");
    }

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1)
            throws BeansException {
        System.out.println("16、执行BeanPostProcessor实现类postProcessAfterInitialization方法");
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1)
            throws BeansException {
        System.out.println("11、执行BeanPostProcessor实现类postProcessBeforeInitialization方法");
        return arg0;
    }
}
