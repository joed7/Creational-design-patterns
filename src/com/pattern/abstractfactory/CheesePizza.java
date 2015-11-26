package com.pattern.abstractfactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory factory;
	
	
	public CheesePizza(PizzaIngredientFactory factory) {
		super();
		this.factory = factory;
	}


	@Override
	public void prepare() {
		factory.createDough();
		factory.createSauce();
		factory.createCheese();
	}

}
