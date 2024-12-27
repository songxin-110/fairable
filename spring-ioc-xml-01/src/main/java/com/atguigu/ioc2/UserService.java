package com.atguigu.ioc2;

import lombok.ToString;

@ToString
public class UserService {
    private UserDao userDao;
    private String name;
    private Integer age;

    public UserService(UserDao userDao, String name, Integer age) {
        this.userDao = userDao;
        this.name = name;
        this.age = age;
    }
}
