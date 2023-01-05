package com.example.dec2022.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/greet")
    public String hello() {
        return "WELCOME TO THE SPRINGBOOT FRAMEWORK";
    }
    @GetMapping("/greet/{name}")
    public String hello(@PathVariable("name") String nameInput) {
        return "Hello " + nameInput + ", WELCOME TO THE SPRINGBOOT FRAMEWORK";
    }
}
