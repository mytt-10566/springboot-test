package com.momo.springboottest.service;

import com.momo.springboottest.po.User;
import org.springframework.stereotype.Service;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
@Service
public class UserService {

    public User findById(Long id) {
        if (id == 0L) {
            throw new RuntimeException("id无效");
        }
        return new User();
    }

}
