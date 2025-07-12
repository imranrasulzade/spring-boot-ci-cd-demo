package com.example.springbootcicddemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    @GetMapping
    public String sayHello() {
        System.out.println("Hello World");
        System.out.println("Some");
        System.out.println("smthng");
        System.out.println("Salam");
        return "Hello World!";
    }

}
