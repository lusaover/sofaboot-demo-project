package com.lusaover.demo.controller.impl;



import com.lusaover.common.pojo.User;
import com.lusaover.common.service.UserService;
import com.lusaover.demo.controller.UserControllerC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserControllerImpl2 implements UserControllerC {

    @SofaReference(interfaceType = UserService.class, uniqueId = "user5", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private UserService userService;


    @GetMapping
    public List<User> getAll() {
        return userService.getUser();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable Integer id) {
        System.out.println(id);
        userService.getUserById(id);
        return userService.getUserById(id);
    }


    @RequestMapping(method = RequestMethod.POST)
    public String save(@RequestBody User user) {
        return userService.saveUSer(user);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public String update(@RequestBody User user) {
        return userService.updateUser(user);
    }


    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}

