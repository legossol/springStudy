package com.example.testate.api.common.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHomeController {
    @GetMapping("/")
    public String home(){
        
        return new SimpleDateFormat("yyyy/mm/dd HH:mm:ss").format(new Date());

    }
}
