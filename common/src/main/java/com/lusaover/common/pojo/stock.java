package com.lusaover.common.pojo;

import com.alibaba.druid.pool.ha.selector.StickyDataSourceHolder;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lusao
 * @version 1.0
 * @description: TODO
 * @date 2022/7/15 14:48
 */
@TableName("stock_tb")
public class stock {

    // 库存ID
    private int id;

    // 产品编码
    private String productCode;

    // 产品名
    private String name;

    // 产品描述
    private String description;

    // 产品剩余数量
    private int count;

    // 产品价格
    private BigDecimal price;


    // 产品生产时间
    private Date productDate;

    @Override
    public String toString() {
        return "stock{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", productDate=" + productDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
