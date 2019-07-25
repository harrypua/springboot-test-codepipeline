package com.example.test.springbootapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String testRoute() {
        return "test ok! 20190725";
    }
}
