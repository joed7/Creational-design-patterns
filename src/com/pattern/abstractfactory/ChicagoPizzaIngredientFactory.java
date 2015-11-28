package com.pattern.abstractfactory;

/**
 * Factory for Chicago ingredients
 * @author rohit
 *
 */

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return null;
	}

	@Override
	public Sauce createSauce() {
		return null;
	}

	@Override
	public Cheese createCheese() {
		return null;
	}

	@Override
	public Veggies createVeggies() {
		return null;
	}

	@Override
	public Pepproni createPepporoni() {
		return null;
	}

	@Override
	public Clam createClam() {
		return null;
	}

}
