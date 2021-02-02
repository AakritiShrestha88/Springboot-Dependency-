package com.sfgdi.controller;

import com.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerInjectedControllerTest {
    ControllerInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ControllerInjectedController( new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}