package com.example.demo;


import java.util.ArrayList;
import java.util.List;

public class Users {

    public List<User> users = new ArrayList<>();
    {
        User admin = new User("admin","0000");
        User user = new User("user","1111");
    }
}
