package com.atguigu.spring5.dao;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Dao的方法被调用了");
    }
}
