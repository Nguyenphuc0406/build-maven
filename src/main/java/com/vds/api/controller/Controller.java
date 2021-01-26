package com.vds.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
    @GetMapping(value = "/check-v2")
    public String check(){
        return "Check Success !";
    }
    @GetMapping(value = "/check-v3")
    public String checkV3(){
        return "Check Success V3 !";
    }
}
