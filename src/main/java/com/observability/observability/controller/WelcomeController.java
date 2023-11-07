package com.observability.observability.controller;

import com.observability.observability.service.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/welcome")
public class WelcomeController {
    private final WelcomeService welcomeService;

    public WelcomeController (WelcomeService welcomeService) {
        this.welcomeService=welcomeService;
    }

    @GetMapping
    public String callWelcome () {
        return welcomeService.returnHello();
    }
}
