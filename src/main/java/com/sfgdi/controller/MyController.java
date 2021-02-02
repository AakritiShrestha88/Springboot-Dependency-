package com.sfgdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String syHello(){
        System.out.println("Hello World");
        return "Hi Folks";
    }
}
