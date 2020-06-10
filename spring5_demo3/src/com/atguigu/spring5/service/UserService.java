package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {
    @Value(value = "abc")
    private String name;

    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;
    public void add(){
        System.out.println("你大爷的");
        userDao.add();
        System.out.println(name);
    }

}
