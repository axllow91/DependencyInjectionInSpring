package com.springframeworktutorial.didemo.controllers;

import com.springframeworktutorial.didemo.services.GreetingServiceImplem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController =
                new ConstructorInjectedController(new GreetingServiceImplem());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImplem.HELLO_ME, constructorInjectedController.sayHello());
    }
}
