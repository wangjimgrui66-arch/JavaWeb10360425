/*
 * 英才汇硕信息科技有限公司 拥有本软件版权 2024 并保留所有权利。
 * Copyright 2024-2028, YCHS Information&Science Technology Co.,Ltd,
 * All rights reserved.
 */
package com.yckj.util;

import java.sql.*;

/**
 * 数据库连接，获得数据库
 *
 * @author wjr
 * @version 1.0
 */
public class DBUtil {
    public static void main(String[] args) {
        System.out.println(DBUtil.getConnection());

    }
    /**
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        //注册MySQL驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //全限定类名
            String url = "jdbc:mysql://localhost:3306/java1036db?serverTimzone=UTC";
            conn = DriverManager.getConnection(url, "root", "123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭资源
     *
     * @param rs    结果集
     * @param pstmt 预编译对象
     * @param conn   数据库连接
     */
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null){
                pstmt.close();
            }
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
