package com.pattern.abstractfactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory factory;
	private Cheese cheese;

	public CheesePizza(PizzaIngredientFactory factory) {
		super();
		this.factory = factory;
	}

	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}

}
