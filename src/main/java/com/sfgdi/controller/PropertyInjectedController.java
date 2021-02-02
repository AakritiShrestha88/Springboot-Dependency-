package com.sfgdi.controller;

import com.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    //bean name gonna be class name with first letter lower case
    @Autowired
    //annotation going to tell the spring Framework that we want a greeting services inject into this bean
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
