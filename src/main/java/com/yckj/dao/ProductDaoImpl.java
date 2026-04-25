/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.dao;

import com.yckj.entity.Product;
import com.yckj.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ProductDao实现类
 *
 * @author wjr
 * @version 1.0
 */
public class ProductDaoImpl implements ProductDao {

    /**
     * 添加商品
      * @param product 商品对象
     * @return 添加成功，返回1，否则返回0
     */
    public int insertProduct(Product product) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int flag = 0;
        conn = DBUtil.getConnection();
        String sql = "INSERT INTO product(productname,price,producer,remark) VALUES(?,?,?,?)";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, product.getProductName());
            pstmt.setDouble(2, product.getPrice());
            pstmt.setString(3, product.getProducer());
            pstmt.setString(4, product.getRemark());
            flag = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(null, pstmt, conn);
        }
        return flag;
    }

}
