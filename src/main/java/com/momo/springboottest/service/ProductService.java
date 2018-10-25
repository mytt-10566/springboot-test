package com.momo.springboottest.service;

import com.momo.springboottest.po.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
@Service
public class ProductService {

    public List<Product> getProductListByUserId(Long userId) {
        // 其他服务提供
        return null;
    }
}
