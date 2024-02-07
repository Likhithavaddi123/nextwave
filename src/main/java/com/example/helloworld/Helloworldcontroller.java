package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
    @GetMapping("/")
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("/name")
    public String printname() {
        return "Rahul";
    }
}