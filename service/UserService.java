package com.example.simplejavaapp.service;

import com.example.simplejavaapp.entity.User;

public class UserService {

    public String findUser(User user) {
           int exp=user.getExperience();
            if (exp >= 3 && user.getDomain().contains("Java")) {
                return  "User shortlisted details :-"+"\n"+
                        "Name"+" : "+user.getFirstName() + user.getLastName()+"\n"+
                        "Role"+":"+user.getRole();
            }
            else {
                return "User '"+user.getFirstName() + "' is not shortlisted";
            }
    }
}

