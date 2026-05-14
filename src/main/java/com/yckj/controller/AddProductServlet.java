package com.yckj.controller;

import com.yckj.entity.Product;
import com.yckj.service.ProductService;
import com.yckj.service.ProductServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wjr
 * @version 1.0
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
    //业务处理类对象，多态 类实现接口 (子类对象被声明为接口类型)
    ProductService productService = new ProductServiceImpl();

    // 处理第一个请求之前 被容器（如 Tomcat）自动调用；只执行1次
    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        //处理网页传来的汉字乱码
        request.setCharacterEncoding("utf-8");
        //接受网页的数据
        String productName = request.getParameter("productName");
        String price = request.getParameter("price");
        double priceNumber = Double.parseDouble(price); //把一个字符串变成一个数字
        String producer = request.getParameter("producer");
        String remark = request.getParameter("remark");
        //把接受的数据封装到一个Product对象里
        Product product = new Product();
        //把productName,price,producer,remark放到Product里面
        product.setProductName(productName);
        product.setPrice(priceNumber);
        product.setProducer(producer);
        product.setRemark(remark);
        //调用业务方法，添加数据
        int flag = productService.addProduct(product);
        if (flag == 1){
            response.sendRedirect("success.html");
        }else {
            response.sendRedirect("failure.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        this.doGet(request, response);
    }
}
 