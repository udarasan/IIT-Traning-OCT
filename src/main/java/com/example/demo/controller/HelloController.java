package com.example.demo.controller;

import com.example.demo.dto.Number;
import org.springframework.web.bind.annotation.*;

/**
 * @TimeStamp 2024-11-06 23:04
 * @ProjectDetails demo
 * @Author udarasan
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping
    public String test(){
        return "Hello";
    }


    @PostMapping("/test")
    public int test(@RequestBody Number number){
        int x=number.getNum24()+number.getNum24();
        return x;
    }



}
