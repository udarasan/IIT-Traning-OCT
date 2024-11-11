package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    // path = localhost:8080/api/v1/user/deleteUser/?
    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable int id){
        //call the service layer
        userService.deleteUserOnService(id);
        return true;
    }

    @GetMapping("/getOneUser/{userid}")
    public Optional<User> getOneUser(@PathVariable int userid){
        //call service layer
        return userService.getOneUserOnService(userid);
    }
    @GetMapping("/getAllUsersByCustomQuery/{email}")
    public List<UserDTO> getAllUsersByCustomQuery(@PathVariable String email){
        List<UserDTO> userList=userService.getAllUsersByCustomQuery(email);
        return userList;
    }

}
