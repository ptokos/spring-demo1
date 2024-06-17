package com.example.demo;

import com.example.demo.controller.user.UserController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBeanConfiguration {

    @Bean
    public UserController userController() {
        return new UserController();
    }
}
