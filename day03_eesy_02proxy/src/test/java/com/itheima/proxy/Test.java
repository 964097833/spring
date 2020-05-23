package com.itheima.proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IProducer ip = (IProducer)ac.getBean("producer");
        //3.执行方法
        ip.saleProduct(1000f);
    }
}
