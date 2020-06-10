package com.atguigu.spring5.testdemo;
import com.atguigu.spring5.config.SpringConfig;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class TestSpring5Demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
    //完全注解配置类的方式
    @Test
    public void testCollection2(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

}
