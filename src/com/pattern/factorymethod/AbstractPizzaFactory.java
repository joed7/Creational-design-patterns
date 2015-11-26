package com.pattern.factorymethod;

public abstract class AbstractPizzaFactory {

	public abstract Pizza createPizza(String name);

	public Pizza producePizza(String name) {
		Pizza p = null;

		p = createPizza(name);

		p.bake();
		p.packing();
		p.delivery();

		return p;

	}
}
