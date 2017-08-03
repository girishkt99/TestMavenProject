package com.coffeemachine;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testSimpleUse() {
		// Given I start the coffee machine
    actionwords.iStartTheCoffeeMachine();
    // When I take a coffee
    actionwords.iTakeACoffee();
    // Then coffee should be served
    actionwords.coffeeShouldBeServed();
    }
}