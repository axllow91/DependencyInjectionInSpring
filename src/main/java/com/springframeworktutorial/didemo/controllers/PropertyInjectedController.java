package com.springframeworktutorial.didemo.controllers;

import com.springframeworktutorial.didemo.services.GreetingServiceImplem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


// This is how hot to work with DI
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImplem greetingService;

//    public PropertyInjectedController(GreetingServiceImplem greetingService) {
//        this.greetingService = greetingService;
//    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
