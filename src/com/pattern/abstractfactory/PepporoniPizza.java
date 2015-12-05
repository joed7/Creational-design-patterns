package com.pattern.abstractfactory;


public class PepporoniPizza extends Pizza {
	
	PizzaIngredientFactory factory;
	private Pepproni pepporoni;

	
	public PepporoniPizza(PizzaIngredientFactory factory) {
		super();
		this.factory = factory;
	}


	@Override
	public void prepare() {
		dough = factory.createDough();
		sauce = factory.createSauce();
		pepporoni = factory.createPepporoni();
	}

}
