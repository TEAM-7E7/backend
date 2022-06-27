package com.example.selldio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String test(){
        return "하이";
    }
}
