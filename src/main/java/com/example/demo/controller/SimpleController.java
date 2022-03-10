package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class SimpleController {
    @GetMapping
    public String Get()
    {
        return System.getenv("TEST");
    }
}
