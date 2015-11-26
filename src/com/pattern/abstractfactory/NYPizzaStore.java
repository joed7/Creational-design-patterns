package com.pattern.abstractfactory;


public class NYPizzaStore extends AbstractPizzaStore {

	@Override
	protected Pizza createPizza(String name) {
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		Pizza p = null;
		
		if (name == "cheese") {
			p = new CheesePizza(factory);
		} else if (name == "pepporonoi") {
			p = new PepporoniPizza(factory);
		}
		
		return p;
	}

}
