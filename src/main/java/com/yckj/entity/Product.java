/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.entity;

/**
 * 实体类
 * @author wjr
 * @version 1.0
 */
public class Product {
    int id;
    String productName;
    double price;
    String producer;
    String remark;

    public Product() {
    }

    public Product(int id, String productName, double price, String producer, String remark) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.producer = producer;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
