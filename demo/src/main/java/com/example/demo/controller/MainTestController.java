package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainTestController {

    @GetMapping(value="/test")
    public String test1(){
        System.out.println("hellow");
        return "test";
    }

    @GetMapping("/test2")
    public String test2(){

        System.out.println("hellow2");
        return "test2";
    }
}
