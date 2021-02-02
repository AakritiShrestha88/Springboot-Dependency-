package com.sfgdi.controller;

import com.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String syHello(){

        return greetingService.sayGreeting();
    }
}
