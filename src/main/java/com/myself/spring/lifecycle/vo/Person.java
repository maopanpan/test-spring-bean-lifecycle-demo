package com.myself.spring.lifecycle.vo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author 【name】毛攀攀
 * @author 【date】2019/04/25
 * @author 【时间】22:43
 * @author 【说明】
 * @author 【工程】test-spring-lifecycle-demo
 * @author 【目录】com.myself.spring.lifecycle.vo
 */
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String name;
    private String address;
    private String phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        System.out.println("6、实例化Bean");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("8、设置Bean属性");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("8、设置Bean属性");
        this.address = address;
    }

    String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        System.out.println("8、设置Bean属性");
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", name=" + name + ", phone="
                + phone + "]";
    }

    // 这是BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        System.out
                .println("10、调用BeanFactoryWare实现类setBeanFactory方法");
        this.beanFactory = arg0;
    }

    // 这是BeanNameAware接口方法
    @Override
    public void setBeanName(String arg0) {
        System.out.println("9、调用BeanNameWare实现类setBeanName方法");
        this.beanName = arg0;
    }

    // 这是InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("12、调用InitializingBean实现类afterPropertiesSet方法");
    }

    // 这是DiposibleBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("19、调用Diposible实现类的destory方法");
    }

    // 通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("15、调用Bean init-method初始化方法");
    }

    // 通过<bean>的destroy-method属性指定的初始化方法
    public void myDestory() {
        System.out.println("20、调用Bean destory-method方法");
    }
}
