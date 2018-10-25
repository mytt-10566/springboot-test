package com.momo.springboottest.controller;

import com.momo.springboottest.po.User;
import com.momo.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
@RestController
@RequestMapping("/user")
public class UserControllerTest {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }
}
