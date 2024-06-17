package com.example.demo.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping( "/detail")
    public User detail( ) {

        return new User("peter", 10, "dev");
    }
}
