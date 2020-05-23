package com.disqo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class HealthCheckController {

    @GetMapping("/ping")
    public String healthCheck() {
        return "I am healthy and ready to take calls!";
    }




}
