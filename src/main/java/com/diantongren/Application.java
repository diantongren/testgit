package com.diantongren;

import com.diantongren.pojo.User;

public class Application {
    public static void main(String[] args) {
        User user = new User();
        user.setId(123123123);
        user.setUsername("diantongren");
        user.setPassword("password");
        user.setAge(22);
        user.setEmail("diantongren@xxx.com");

        System.out.println(user);
    }
}
