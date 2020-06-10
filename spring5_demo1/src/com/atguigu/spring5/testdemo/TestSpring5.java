package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

public class TestSpring5 {
    @Test
    public void testAdd(){
//        1.加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
//        2.获取配置创建的对象
        Emp emp=context.getBean("emp", Emp.class);
        System.out.println(emp);

    }

}
