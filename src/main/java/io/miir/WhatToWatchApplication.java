package io.miir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WhatToWatchApplication implements ErrorController{

    public static void main(String[] args) {
        SpringApplication.run(WhatToWatchApplication.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/error")
    String error(){
        return "There is an error";
    }

    @Override
    public String getErrorPath(){
        return "/error";
    }

    @RequestMapping("/test")
    String test(){
        return "This is a test page";
    }

}
