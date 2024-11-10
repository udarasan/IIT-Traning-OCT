package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @TimeStamp 2024-11-07 21:39
 * @ProjectDetails demo
 * @Author udarasan
 */

//service = business logics handel
@Service
public class UserService {

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

    /// POST __>>>
    // controller > (DTO - DATA Transfer Obj.) > Service
    // service > (ENTITY) > Repository

    ///GET
    //repository > (ENTITY) >Service
    //service > (DTO) >controller
    public List<UserDTO> getAllUsersOnService(){

        //get all data from db and put all data in to entity type user object
        List<User> userList=userRepository.findAll();
        //print data
        System.out.println(userList);
        //create a new object called UserDTO
        List<UserDTO>userDTOS=new ArrayList<>();

        //add all data into userDtoList(dto type) from user(entity type) list
        for (User user:userList) {
            UserDTO userDTO=new UserDTO(user.getId(),user.getUsername(),user.getPassword(),user.getfName(),user.getsName(),user.getEmail());
            userDTOS.add(userDTO);
            //print data
            System.out.println(userDTO);

        }
        return userDTOS;
    }
    public void updateUser(UserDTO userDTO) {

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
