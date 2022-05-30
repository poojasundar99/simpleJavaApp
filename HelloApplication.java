package com.example.simplejavaapp;

import com.example.simplejavaapp.controller.SimpleJavaController;
import com.example.simplejavaapp.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloApplication {
    public static void main(String[] args) {

        User user=new User("Sanjay","Rai", Arrays.asList("Java","Scala"),"Developer",3);
        User user1=new User("Sri","Ram", Arrays.asList("Java","Scala"),"Developer",5);
        User user3=new User("Akash","Kumar", Arrays.asList("Java","Scala"),"Developer",2);
        List<User> userList=new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user3);
        SimpleJavaController simpleJavaController=new SimpleJavaController();
        userList.forEach(user2 -> {
            System.out.println(simpleJavaController.findCandidates(user2));
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        });;




    }
}