package com.myself.spring.lifecycle.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * @author 【name】毛攀攀
 * @author 【date】2019/04/25
 * @author 【时间】22:49
 * @author 【说明】
 * @author 【工程】test-spring-lifecycle-demo
 * @author 【目录】com.myself.spring.lifecycle.common
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    public MyInstantiationAwareBeanPostProcessor() {
        super();
        System.out.println("4、实例化InstantiationAwareBeanPostProcessorAdapter实现类");
    }

    // 接口方法、实例化Bean之前调用
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass,
                                                 String beanName) throws BeansException {
        System.out.println("5、调用InstantiationAwareBeanPostProcessorAdapter实现类postProcessBeforeInstantiation方法");
        return null;
    }

    // 接口方法、实例化Bean之后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("17、执行InstantiationAwareBeanPostProcessorAdapter实现类postProcessorAfterInitialization方法");
        return bean;
    }

    // 接口方法、设置某个属性时调用
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs,
                                                    PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        System.out.println(" 7、调用InstantiationAwareBeanPostProcessorAdapter实现类postProcessSetVlues方法");
        return pvs;
    }
}
