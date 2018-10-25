package com.momo.springboottest.service;

import com.momo.springboottest.po.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void testFindById() {
        User user = userService.findById(0L);
        Assert.assertNotNull(user);
    }
}
