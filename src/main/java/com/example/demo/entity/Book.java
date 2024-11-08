package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @TimeStamp 2024-11-08 21:54
 * @ProjectDetails demo
 * @Author udarasan
 */
@Entity
public class Book {
    @Id
    private int id;
    private String name;
}
