package com.lusaover.common.service;

import com.lusaover.common.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    public List<User> getUser();


    public User getUserById(Integer id);


    public String saveUSer(User user);


    public String updateUser( User user);


    public String deleteUser(Integer id);

}
