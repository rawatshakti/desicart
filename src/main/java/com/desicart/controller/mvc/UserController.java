package com.desicart.controller.mvc;

import com.desicart.data.model.User;
import com.desicart.service.IUserService;
import com.desicart.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    IUserService userservice;

//    @Autowired
//    User user;

    @PostMapping(value = "/saveusers")
    public void saveUser(@RequestBody User user){
        userservice.saveUser(user);
        //return true;
    }
    @GetMapping(value= "/getallusers")
    public List<User> getallUser(){
        return userservice.getallUser();
    }

}
