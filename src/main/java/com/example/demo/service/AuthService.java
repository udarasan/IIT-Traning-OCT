package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @TimeStamp 2024-11-07 21:39
 * @ProjectDetails demo
 * @Author udarasan
 */

//service = business logics handel
@Service
public class AuthService {
    public boolean checkLoginDetails(UserDTO userDTO){
        System.out.println("UserDTO Name : " + userDTO.getUsername());
        System.out.println("Password : " + userDTO.getPassword());
        return false;
    }

    public void createAccount(UserDTO userDTO) {
        //save in db
        System.out.println("UserDTO Name : " + userDTO.getUsername());
        System.out.println("Password : " + userDTO.getPassword());
        System.out.println("first name : " + userDTO.getfName());
        System.out.println("second name : " + userDTO.getsName());
        System.out.println("email : " + userDTO.getEmail());
    }
}
