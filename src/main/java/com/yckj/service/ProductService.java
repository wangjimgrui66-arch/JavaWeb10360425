/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.service;

import com.yckj.entity.Product;

/**
 * 商品管理业务接口
 * @author wjr
 * @version 1.0
 */
public interface ProductService {
    /**
     * 添加商品业务方法
     * @param product 商品对象
     * @return 添加成功返回1，否则返回0
     */
    public  int addProduct(Product product);

}
