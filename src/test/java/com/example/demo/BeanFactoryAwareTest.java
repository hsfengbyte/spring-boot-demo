package com.example.demo;

import com.example.demo.entity.Hello;
import com.example.demo.entity.MyTestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryAwareTest implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware() {
        Hello hello = (Hello) beanFactory.getBean("hello");
        hello.say();
    }

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactoryAwareTest.xml");
        BeanFactoryAwareTest beanFactoryAwareTest = (BeanFactoryAwareTest) beanFactory.getBean("beanFactoryAwareTest");
        beanFactoryAwareTest.testAware();
    }
}
