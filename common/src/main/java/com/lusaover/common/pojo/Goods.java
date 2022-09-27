package com.lusaover.common.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;



/**
 *
 * 货物类
 * @author lusao
 * @version 1.0
 * @description: TODO
 * @date 2022/7/12 13:38
 */

@TableName("goods_tb")
public class Goods {

    // 货物ID
    private int gid;

    // 货物名称
    private String gname;

    // 货物剩余数量
    private int remaining;

    //货物进价
    @TableField("purchasePrice")
    private BigDecimal purchasePrice;

    // 货物售价
    private BigDecimal price;

    // 货物所在仓库，存放仓库地址
    private int depository;

    // 货物最近一次入库时间，
    @TableField("inDate")
    private Date inDate;

    // 最近一次出库时间
    @TableField("lastDate")
    private Date lastDate;

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", remaining=" + remaining +
                ", purchasePrice=" + purchasePrice +
                ", price=" + price +
                ", depository=" + depository +
                ", inDate='" + inDate + '\'' +
                ", lastDate='" + lastDate + '\'' +
                '}';
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDepository() {
        return depository;
    }

    public void setDepository(int depository) {
        this.depository = depository;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {

        this.inDate = inDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }
}
