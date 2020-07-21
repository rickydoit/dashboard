package com.myspring.dashboard.controller;

import com.myspring.dashboard.entity.User;
import com.myspring.dashboard.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Random;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //http://127.0.0.1:8080/users/1
    //@ApiOperation(value = "获取用户",notes = "根据用户id获取用户")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable long id){
        User user = userService.getUser(id);
        return user;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Void addUser(){

        User user = new User();
        userService.addUser(user);
        return null;
    }

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(Model model){
        model.addAttribute("name","hello, springboot");
        return "index";
    }
}
