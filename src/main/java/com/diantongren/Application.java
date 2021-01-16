package com.diantongren;

import com.diantongren.dao.UserDao;
import com.diantongren.pojo.User;

public class Application {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = userDao.getUser1();
        User user2 = userDao.getUser2();

        System.out.println(user1);
        System.out.println(user2);
    }
}
