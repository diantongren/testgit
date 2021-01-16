package com.diantongren.dao;

import com.diantongren.pojo.User;
import lombok.Data;

//模拟dao
@Data
public class UserDao {
    private User user1 = new User();
    private User user2 = new User();

    public UserDao(){
        user1.setId(1);
        user1.setUsername("d1");
        user1.setPassword("123456");
        user1.setAge(111);
        user1.setEmail("diantongren@xxx.com");

        user2.setId(2);
        user2.setUsername("d2");
        user2.setPassword("123456");
        user2.setAge(222);
        user2.setEmail("diantongren@xxx.com");
    }
}
