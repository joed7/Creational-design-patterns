package com.pattern.factorymethod;

public class ModifiedNYPizzaFactory extends AbstractPizzaFactory {

	@Override
	protected Pizza createPizza(String name) {
		Pizza p = null;

		if (name == "nypizza1") {
			p = new NYPizza1();
		} else if (name == "nypizza2") {
			p = new NYPizza2();
		}
		return p;

	}

}
