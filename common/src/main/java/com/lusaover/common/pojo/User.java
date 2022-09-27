package com.lusaover.common.pojo;

import com.baomidou.mybatisplus.annotation.*;

/**
 * User类
 */
@TableName("user_tb")
public class User {

    @TableId(type = IdType.AUTO)
    private int id;

    //插入数据时进行自动填充
    @TableField(fill = FieldFill.INSERT)
    private String name;

    // 性别，0女，1男，无设置性别为2
    private int gender;
    private int age;
    private String tel;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}