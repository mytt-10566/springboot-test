package com.momo.springboottest.service;

import com.momo.springboottest.po.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    
    @MockBean
    private ProductService productService = null;
    
    private void prepare() {
        Product product = new Product();
        product.setId(1L);
        product.setProductName("Java编程思想");
        List<Product> productList = Arrays.asList(product);
        // 指定Mock Bean方法和参数
        BDDMockito.given(this.productService.getProductListByUserId(1L)).willReturn(productList);
    } 
    
    @Test
    public void testGetProductByUserId() {
        this.prepare();
        // 进行mock测试
        List<Product> productList = productService.getProductListByUserId(1L);
        Assert.assertNotNull(productList);
        
    }
}
