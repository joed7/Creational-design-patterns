package com.pattern.factorymethod;

public class ChicagoPizzaStore {

	public SimplePizzaFactory pizzaFactory;

	public ChicagoPizzaStore(SimplePizzaFactory productFactory) {
		super();
		this.pizzaFactory = productFactory;
	}

	public Pizza producePizza(String name) {
		Pizza p = null;

		p = pizzaFactory.createPizza(name);

		p.bake();
		p.packing();
		//p.delivery();

		return p;

	}
}
