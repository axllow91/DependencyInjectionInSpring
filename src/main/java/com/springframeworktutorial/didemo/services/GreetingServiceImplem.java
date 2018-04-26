package com.springframeworktutorial.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplem implements GreetingService {
    public static final String HELLO_ME = "Hello Me";

    @Override
    public String sayGreeting() {
        return HELLO_ME;
    }

}
