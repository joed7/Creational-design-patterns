package com.pattern.factorymethod;

public class NYPizzaStore {
	
	public SimplePizzaFactory pizzaFactory;

	public NYPizzaStore(SimplePizzaFactory productFactory) {
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
