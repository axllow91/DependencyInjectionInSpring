package com.springframeworktutorial.didemo.controllers;

import com.springframeworktutorial.didemo.services.GreetingServiceImplem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImplem());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImplem.HELLO_ME, setterInjectedController.sayHello());
    }
}
