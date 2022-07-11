//package com.lusaover.demo.controller;
//
//import com.alipay.sofa.runtime.api.annotation.SofaService;
//import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.lusaover.demo.service.UserService;
//import com.lusaover.demo.pojo.User;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
////@RestController
////@ResponseBody
////@RequestMapping("/user")
//@Service
//@SofaService(interfaceType = IUserController.class, uniqueId = "user5", bindings = { @SofaServiceBinding(bindingType = "bolt") })
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
////    @GetMapping
//    public List<User> getAll(){
//        System.out.println(userService.list());
//        return userService.list();
//    }
//
////    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public User getById(@PathVariable Integer id){
////        System.out.println(id);
//        return userService.getById(id);
//    }
//
////    @RequestMapping(method = RequestMethod.POST)
//    public String save( User user){
//        userService.save(user);
//        return null;
//    }
//
////    @RequestMapping(method = RequestMethod.PUT)
//    public String update(User user){
//        userService.updateById(user);
//        return null;
//    }
//
////    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
//    public String delete(@PathVariable Integer id){
//        userService.removeById(id);
//        return  null;
//    }
//}
//
