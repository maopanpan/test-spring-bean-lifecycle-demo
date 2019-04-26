package com.myself.spring.lifecycle.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author 【name】毛攀攀
 * @author 【date】2019/04/25
 * @author 【时间】22:52
 * @author 【说明】
 * @author 【工程】test-spring-lifecycle-demo
 * @author 【目录】com.myself.spring.lifecycle.common
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public MyBeanFactoryPostProcessor() {
        super();
        System.out.println("1、实例化BeanFactoryPostProcessor实现类");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
        System.out.println("2、调用BeanFactoryPostProcessor实现类postProcessBeanFactory方法");
        BeanDefinition bd = arg0.getBeanDefinition("person");
        bd.getPropertyValues().addPropertyValue("phone", "110");
    }
}
