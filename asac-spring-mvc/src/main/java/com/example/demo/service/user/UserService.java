package com.example.demo.service.user;

import com.example.demo.controller.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(Integer id) {
        return new User("peter", 20, "null");
    }
}
