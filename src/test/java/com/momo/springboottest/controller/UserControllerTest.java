package com.momo.springboottest.controller;

import com.momo.springboottest.po.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
    
//    @Autowired
    private TestRestTemplate restTemplate;
    
//    @Test
    public void testFindById() {
        User user = this.restTemplate.getForObject("/user/findById/{id}", User.class, 1L);
        Assert.assertNotNull(user);
    }
    
}
