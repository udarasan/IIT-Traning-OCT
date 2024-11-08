package com.example.demo.repository;


import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 * @TimeStamp 2024-11-08 21:56
 * @ProjectDetails demo
 * @Author udarasan
 */
@Repository
public interface UserRepository extends JpaRepository <User,Integer> {

}
