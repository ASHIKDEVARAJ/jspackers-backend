package com.jspackers.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String testAPI() {
        return "Hello from JS Packers Backend!";
    }
}
