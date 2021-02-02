package com.sfgdi.controller;

import com.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ControllerInjectedControllerTest {
    ControllerInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ControllerInjectedController( new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}