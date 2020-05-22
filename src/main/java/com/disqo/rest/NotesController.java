package com.disqo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class NotesController {

    @GetMapping("/ping")
    public String healthCheck() {
        return "I am healthy and ready to take calls!";
    }


}
