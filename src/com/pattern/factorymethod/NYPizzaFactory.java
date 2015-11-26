package com.pattern.factorymethod;

public class NYPizzaFactory {
	
	public SimplePizzaFactory pizzaFactory;

	public NYPizzaFactory(SimplePizzaFactory productFactory) {
		super();
		this.pizzaFactory = productFactory;
	}

	public Pizza producePizza(String name) {
		Pizza p = null;

		p = pizzaFactory.createPizza(name);

		p.bake();
		p.packing();
		p.delivery();

		return p;

	}

}
