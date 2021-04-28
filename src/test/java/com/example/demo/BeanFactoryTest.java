package com.example.demo;

import com.example.demo.entity.MyTestBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
//        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean(MyTestBean.class);
        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        System.out.println(myTestBean.getTestStr());
    }
}
