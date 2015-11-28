package com.pattern.abstractfactory;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies createVeggies();

	public Pepproni createPepporoni();

	public Clam createClam();

}
