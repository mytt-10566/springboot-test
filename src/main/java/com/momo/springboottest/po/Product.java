package com.momo.springboottest.po;

/**
 * @author: MQG
 * @date: 2018/10/25
 */
public class Product {

    private Long id;
    private String productName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
