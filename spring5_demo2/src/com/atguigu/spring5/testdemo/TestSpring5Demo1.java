package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class TestSpring5Demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu=context.getBean("stu",Stu.class);
        stu.print();
    }

    /**
     * bean生命周期的测试
     */
    @Test
    public void testCollection1(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders=context.getBean("orders", Orders.class);
        System.out.println("第六步获取bean成功");
        context.close();

    }
}
