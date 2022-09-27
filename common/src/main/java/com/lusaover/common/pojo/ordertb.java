package com.lusaover.common.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author lusao
 * @version 1.0
 * @description: TODO
 * @date 2022/7/15 16:15
 */

@TableName("order_tb")
public class ordertb {

    // 订单ID
    private int id;

    // 下单用户
    private String userName;

    // 下单产品
    private String productCode;

    // 下单数量
    private int count;


    @Override
    public String toString() {
        return "ordertb{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", count=" + count +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
