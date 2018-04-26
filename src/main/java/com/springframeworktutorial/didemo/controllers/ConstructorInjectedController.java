package com.springframeworktutorial.didemo.controllers;

import com.springframeworktutorial.didemo.services.GreetingService;

import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Automatic autowired on constructor dependency injection
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
