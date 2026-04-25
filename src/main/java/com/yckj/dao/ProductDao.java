/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.dao;

import com.yckj.entity.Product;

/**
 * Dao接口：操作Product表的所有方法（CRUD)
 *
 * @author wjr
 * @version 1.0
 */
public interface ProductDao {
    /**
     * 添加商品
     *
     * @param product 商品对象
     * @return 添加成功，返回1；否则返回0
     */
    public int insertProduct(Product product);
}
