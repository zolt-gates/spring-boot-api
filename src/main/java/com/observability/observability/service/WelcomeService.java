package com.observability.observability.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String returnHello (){
        return "Hello World!";
    }
}
