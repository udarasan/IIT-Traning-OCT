package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @TimeStamp 2024-11-07 21:39
 * @ProjectDetails demo
 * @Author udarasan
 */

//service = business logics handel
@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;
    public boolean checkLoginDetails(UserDTO userDTO){
        System.out.println("UserDTO Name : " + userDTO.getUsername());
        System.out.println("Password : " + userDTO.getPassword());
        return false;
    }

    public void createAccount(UserDTO userDTO) {

        User test=new User();

        test.setId(userDTO.getId());
        test.setUsername(userDTO.getUsername());
        test.setEmail(userDTO.getEmail());
        test.setfName(userDTO.getfName());
        test.setsName(userDTO.getsName());
        test.setPassword(userDTO.getPassword());

        userRepository.save(test);
    }
}
