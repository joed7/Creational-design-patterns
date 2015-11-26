package com.pattern.factorymethod;

public class SimplePizzaFactory {

	public Pizza createPizza(String name) {
		Pizza p = null;

		if (name == "nypizza1") {
			p = new NYPizza1();
		} else if (name == "nypizza2") {
			p = new NYPizza2();
		} else if (name == "chicagopizza1") {
			p = new ChicagoPizza1();
		} else if (name == "chicagopizza2") {
			p = new ChicagoPizza2();
		}

		return p;

	}
}
