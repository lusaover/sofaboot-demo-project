package com.lusaover.demo.controller;

import com.lusaover.common.pojo.User;

import java.util.List;

public interface UserControllerC {



    public List<User> getAll();


    public User getById(Integer id);


    public String save(User user);


    public String update(User user);


    public String delete(Integer id);

}
