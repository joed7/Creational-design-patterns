package com.pattern.abstractfactory;


public class PepporoniPizza extends Pizza {
	
	PizzaIngredientFactory factory;

	
	public PepporoniPizza(PizzaIngredientFactory factory) {
		super();
		this.factory = factory;
	}


	@Override
	public void prepare() {
		factory.createDough();
		factory.createSauce();
		factory.createPepporoni();
	}

}
