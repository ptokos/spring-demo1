package com.example.demo.controller.user;

import com.example.demo.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

//    @Autowired
    private final UserService userService;



//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }



    @GetMapping( "/detail")
    public User detail( ) {

        return userService.getUser(1);
    }
}
