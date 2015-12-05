package com.pattern.abstractfactory;

/**
 * Factory for NY incredients
 * @author rohit
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new NYDough();
	}

	@Override
	public Sauce createSauce() {
		return new NYSauce();
	}

	@Override
	public Cheese createCheese() {
		return new NYCheese();
	}

	@Override
	public Veggies createVeggies() {
		return new NYVeggies();
	}

	@Override
	public Pepproni createPepporoni() {
		return new NYPepporoni();
	}

	@Override
	public Clam createClam() {
		return new NYClam();
	}

}
