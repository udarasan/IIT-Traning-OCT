package com.example.demo.repository;


import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @TimeStamp 2024-11-08 21:56
 * @ProjectDetails demo
 * @Author udarasan
 */
@Repository
public interface UserRepository extends JpaRepository <User,Integer> {

    @Query(value = "select * from user",nativeQuery = true)
    List<User> getAllUsers();

    @Query(value = "select * from user where email=?1",nativeQuery = true)
    List<User> getAllUsers(String email);


    //delete,update,save_all,
}
