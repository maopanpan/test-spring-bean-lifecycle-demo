package com.myself.spring.lifecycle;

import com.myself.spring.lifecycle.vo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring Bean生命周期
 * 1、实例化BeanFactoryPostProcessor实现类;
 * 2、调用BeanFactoryPostProcessor实现类postProcessBeanFactory方法
 * 3、实例化BeanPostProcessor实现类;
 * 4、实例化InstantiationAwareBeanPostProcessorAdapter实现类;
 * 5、调用InstantiationAwareBeanPostProcessorAdapter实现类postProcessBeforeInstantiation方法
 * 6、实例化Bean;
 * 7、调用InstantiationAwareBeanPostProcessorAdapter实现类postProcessSetVlues方法
 * 8、设置Bean属性
 * 9、调用BeanNameWare实现类setBeanName方法
 * 10、调用BeanFactoryWare实现类setBeanFactory方法
 * 11、执行BeanPostProcessor实现类postProcessBeforeInitialization方法
 * 12、调用InitializingBean实现类afterPropertiesSet方法
 * 15、调用Bean init-method初始化方法
 * 16、执行BeanPostProcessor实现类postProcessAfterInitialization方法
 * 17、执行InstantiationAwareBeanPostProcessorAdapter实现类postProcessorAfterInitialization方法
 * 18、容器初始化完成
 * ------------销毁-------------
 * 19、调用Diposible实现类的destory方法
 * 20、调用Bean destory-method方法
 */
public class BeanLifeCycle {

    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("18、容器初始化完成");
        //得到Preson，并使用
        Person person = factory.getBean("person", Person.class);
        System.out.println(person);

        System.out.println("现在开始关闭容器！");
        ((ClassPathXmlApplicationContext) factory).registerShutdownHook();
    }
}
