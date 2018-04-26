package com.springframeworktutorial.didemo.controllers;

import com.springframeworktutorial.didemo.services.GreetingServiceImplem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImplem();
    }

    @Test
    public void testGreetings() throws Exception {
        assertEquals(GreetingServiceImplem.HELLO_ME, propertyInjectedController.sayHello());
    }
}
