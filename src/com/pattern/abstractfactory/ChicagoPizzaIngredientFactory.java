package com.pattern.abstractfactory;

/**
 * Factory for Chicago ingredients
 * @author rohit
 *
 */

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {


	@Override
	public Dough createDough() {
		return new ChicagoDough();
	}

	@Override
	public Sauce createSauce() {
		return new ChicagoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ChicagoCheese();
	}

	@Override
	public Veggies createVeggies() {
		return new ChicagoVeggies();
	}

	@Override
	public Pepproni createPepporoni() {
		return new ChicagoPepporoni();
	}

	@Override
	public Clam createClam() {
		return new ChicagoClam();
	}

}
