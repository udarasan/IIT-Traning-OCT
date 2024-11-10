package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @TimeStamp 2024-11-07 21:23
 * @ProjectDetails demo
 * @Author udarasan
 */
@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public boolean signup(@RequestBody UserDTO userDTO){
        userService.createAccount(userDTO);
        return true;
    }
    @PutMapping("/updateUser")
    public boolean updateUser(@RequestBody UserDTO userDTO){
        userService.updateUser(userDTO);
        return true;
    }


    @GetMapping("/getAllUsers")
    public List<UserDTO> getAllUsers(){
       List<UserDTO> userList=userService.getAllUsersOnService();
       return userList;
    }

}
