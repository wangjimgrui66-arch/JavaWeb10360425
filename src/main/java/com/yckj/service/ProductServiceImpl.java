/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.service;

import com.yckj.dao.ProductDao;
import com.yckj.dao.ProductDaoImpl;
import com.yckj.entity.Product;

/**
 * @author wjr
 * @version 1.0
 */
public class ProductServiceImpl implements ProductService {
    //注意！！！多态
    ProductDao productDao = new ProductDaoImpl();
    /**
     * 添加商品业务方法
     * @param product 商品对象
     * @return 添加成功返回1，否则返回0
     */
    @Override
    public int addProduct(Product product) {
        if(product.getProductName()==null){
            System.out.println("商品名不能为空");
        }
        int flag = productDao.insertProduct(product);
        return flag;
    }
}
