package com.example.testRenovate.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class sampleController {
    @GetMapping("/get")
    public String getString() {
        return "Shivam";
    }
}
