package com.narayan.init.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String Welcome() {
        return "Welcome to Narayan";
    }
}
