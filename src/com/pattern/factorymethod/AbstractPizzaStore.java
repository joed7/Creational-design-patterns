package com.pattern.factorymethod;

public abstract class AbstractPizzaStore {

	protected abstract Pizza createPizza(String name);

	public Pizza orderPizza(String name) {
		Pizza p = null;

		p = createPizza(name);

		p.bake();
		p.packing();
		p.delivery();

		return p;

	}
}
