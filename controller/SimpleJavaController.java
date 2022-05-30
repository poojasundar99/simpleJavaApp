package com.example.simplejavaapp.controller;

import com.example.simplejavaapp.entity.User;
import com.example.simplejavaapp.service.UserService;

import java.util.List;

public class SimpleJavaController {

    UserService userService=new UserService();
    public String findCandidates(User user){

        return userService.findUser(user);


    }


}
