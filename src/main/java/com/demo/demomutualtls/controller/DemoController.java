package com.demo.demomutualtls.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController
{

    @RequestMapping("/start")
    public ResponseEntity<String> startEngine(){
        System.out.printf("logging");
       return ResponseEntity.ok("Entering");
    }
}
