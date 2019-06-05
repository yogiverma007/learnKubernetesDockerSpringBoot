package com.freedom.learnKDSB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/helloworld")
public class HelloWorldController {

    @GetMapping
    public String helloworld() {
        String response = "{\"key\": \"hello\"}";
        return response;
    }

}