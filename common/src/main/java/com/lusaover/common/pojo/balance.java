package com.lusaover.common.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

/**
 * @author lusao
 * @version 1.0
 * @description: TODO
 * @date 2022/7/15 15:27
 */
@TableName("balance_tb")
public class balance {

    // 用户ID
    private int id;

    // 用户名
    private String userName;

    // 用户余额
    private BigDecimal balance;

    @Override
    public String toString() {
        return "balance{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
