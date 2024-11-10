package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @TimeStamp 2024-11-07 21:21
 * @ProjectDetails demo
 * @Author udarasan
 */

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    //dependency injection
    @Autowired
    private UserService authService;
    @PostMapping("/login") //JSON OBJECT --->  In JAVA (JAVA OBJECTS)
    public boolean login(@RequestBody UserDTO userDTO){
        authService.checkLoginDetails(userDTO);
        return true;
    }

    @PostMapping("/signup")
    public boolean signup(@RequestBody UserDTO userDTO){
        authService.createAccount(userDTO);
        return true;
    }

}
