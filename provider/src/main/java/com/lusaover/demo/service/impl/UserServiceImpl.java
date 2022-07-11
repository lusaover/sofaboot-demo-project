package com.lusaover.demo.service.impl;


import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lusaover.common.pojo.User;
import com.lusaover.common.service.UserService;
import com.lusaover.demo.mapper.UserMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Component
@Service
@SofaService(interfaceType = UserService.class, uniqueId = "user5", bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> getUser() {
        return userMapper.selectList(null);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public String saveUSer(User user) {
        userMapper.insert(user);
        return null;
    }

    @Override
    public String updateUser(User user) {
        userMapper.updateById(user);
        return null;
    }

    @Override
    public String deleteUser(Integer id) {
        userMapper.deleteById(id);
        return null;
    }
}


//
//    @Override
//    public List<User> getById(){
//        return userDao.selectList( null );
//    }
//
//    @Override
//    public User getById(Integer id){
////        System.out.println(id);
//        return userDao.selectById(id);
//    }
//
//    @Override
//    public String save(User user){
//        userDao.insert(user);
//        return null;
//    }
//
//    @Override
//    public String update( User user){
//        userDao.updateById(user);
//        return null;
//    }
//
//    @Override
//    public String delete(Integer id){
//        userDao.deleteById(id);
//        return  null;
//    }