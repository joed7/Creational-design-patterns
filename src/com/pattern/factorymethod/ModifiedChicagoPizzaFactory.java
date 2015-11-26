package com.pattern.factorymethod;

public class ModifiedChicagoPizzaFactory extends AbstractPizzaFactory {

	@Override
	protected Pizza createPizza(String name) {
		Pizza p = null;

		if (name == "chicagopizza1") {
			p = new ChicagoPizza1();
		} else if (name == "chicagopizza2") {
			p = new ChicagoPizza2();
		}
		return p;
	}

}
