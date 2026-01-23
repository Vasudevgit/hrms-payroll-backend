package com.example.hrmspayrollbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/welcome")
    public String test(){
        return "HRMS Payroll Backend is Running";
    }
}
